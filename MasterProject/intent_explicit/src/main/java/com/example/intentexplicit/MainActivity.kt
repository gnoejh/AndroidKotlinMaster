// Explicit Intent
//https://developer.android.com/reference/android/content/Intent.html#ACTION_VIEW


package com.example.intentexplicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, SourceActivity::class.java)
            startActivity(intent)
        }
    }
}
