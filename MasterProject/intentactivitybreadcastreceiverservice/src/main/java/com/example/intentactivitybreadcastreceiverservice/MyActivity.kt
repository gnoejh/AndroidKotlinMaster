package com.example.intentactivitybreadcastreceiverservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)

        val data = intent.getStringExtra("data")
        Toast.makeText(this, "Data: $data", Toast.LENGTH_SHORT).show()
        Snackbar.make(
            findViewById(android.R.id.content),
            "Data: $data",
            Snackbar.LENGTH_SHORT
        ).show()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val result = "Hello from MyActivity!"
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}