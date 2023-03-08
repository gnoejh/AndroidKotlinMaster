//Implicit Intent
// https://developer.android.com/reference/android/content/Intent.html#ACTION_VIEW


package com.example.intentimplicit

import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.provider.AlarmClock
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of opening a web page
        val url = "https://www.google.com"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

        // Example of opening the camera app to take a photo
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        // Example of opening the contacts app
        val contactsIntent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))

        // Example of opening the email app to send an email
        val emailIntent = Intent(Intent.ACTION_SENDTO)
        emailIntent.data = Uri.parse("mailto:")
        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@example.com"))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject of the email")
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body of the email")

        // Example of opening the dialer app to make a phone call
        val phoneNumber = "555-1234"
        val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(dialIntent)
        }
    }
}

