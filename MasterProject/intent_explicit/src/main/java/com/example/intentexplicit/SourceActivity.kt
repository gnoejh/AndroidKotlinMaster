package com.example.intentexplicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Define the source activity
class SourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_source)

        // Create an intent to launch the target activity
        val intent = Intent(this, TargetActivity::class.java)

        // Add data to the intent (optional)
        intent.putExtra("message", "Hello from SourceActivity!")

        // Launch the target activity
        startActivity(intent)
    }
}