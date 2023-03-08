package com.example.intentimplicit2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {
            val phoneNumber = etPhoneNumber.text.toString()
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        }

        btnCall.setOnClickListener {
            val phoneNumber = etPhoneNumber.text.toString()
            val intent = Intent(Intent.ACTION_CALL).apply {
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        }

        btnWeb.setOnClickListener {
            val url = etUrl.text.toString()
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://$url")
            }
            startActivity(intent)
        }

        btnMap.setOnClickListener {
            val location = etLocation.text.toString()
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=$location")
            }
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            val recipient = etRecipient.text.toString()
            val subject = etSubject.text.toString()
            val message = etMessage.text.toString()
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, message)
            }
            startActivity(intent)
        }
    }
}
