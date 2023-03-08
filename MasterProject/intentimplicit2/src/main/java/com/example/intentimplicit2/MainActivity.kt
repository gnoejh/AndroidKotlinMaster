package com.example.intentimplicit2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            val inputText = findViewById<EditText>(R.id.etInput).text.toString()

            when {
                // Dial Intent
                inputText.matches(Regex("^[0-9]{10}$")) -> {
                    val intent = Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse("tel:$inputText")
                    }
                    startActivity(intent)
                }
                // Web Intent
                inputText.startsWith("http") -> {
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse(inputText)
                    }
                    startActivity(intent)
                }
                // Map Intent
                inputText.matches(Regex(".*[0-9].*,.*[0-9].*")) -> {
                    // Tashkent: @41.2995,69.2401,12z
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse("geo:$inputText")
                    }
                    startActivity(intent)
                }
                // Email Intent
                inputText.contains("@") -> {
                    val intent = Intent(Intent.ACTION_SEND).apply {
                        type = "message/rfc822"
                        putExtra(Intent.EXTRA_EMAIL, arrayOf(inputText))
                    }
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
