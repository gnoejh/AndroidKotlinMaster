package com.example.intentactivitybreadcastreceiverservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Broadcast received!", Toast.LENGTH_SHORT).show()
//        Snackbar.make(
//            findViewById(android.R.id.content),
//            "Broadcast received!",
//            Snackbar.LENGTH_SHORT
//        ).show()
    }
}
