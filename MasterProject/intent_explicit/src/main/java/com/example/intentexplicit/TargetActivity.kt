package com.example.intentexplicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// Define the target activity
class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        // Get the data from the intent (optional)
        val message = intent.getStringExtra("message")

        // Display the data in a TextView (optional)
        findViewById<TextView>(R.id.textView2).text = message
    }
}
