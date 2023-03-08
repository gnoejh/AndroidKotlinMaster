package com.example.intentactivitybreadcastreceiverservice

//import android.support.design.widget.Snackbar
//import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var activityIntentButton: Button
    private lateinit var broadcastIntentButton: Button
    private lateinit var serviceIntentButton: Button

    private val REQUEST_CODE = 123

    private val activityResultContract = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val data = result.data
            val result = data?.getStringExtra("result")
            Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
            Snackbar.make(
                findViewById(android.R.id.content),
                "Result: $result",
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityIntentButton = findViewById(R.id.activity_intent_button)
        broadcastIntentButton = findViewById(R.id.broadcast_intent_button)
        serviceIntentButton = findViewById(R.id.service_intent_button)

        activityIntentButton.setOnClickListener {
            val intent = Intent(this, MyActivity::class.java)
            intent.putExtra("data", "Hello from MainActivity!")
            activityResultContract.launch(intent)
        }

        broadcastIntentButton.setOnClickListener {
            val intent = Intent("com.example.mybroadcast")
            sendBroadcast(intent)
        }

        serviceIntentButton.setOnClickListener {
            val intent = Intent(this, MyService::class.java)
            startService(intent)
        }
    }
}

