package com.example.intentactivitybreadcastreceiverservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MyService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service started!", Toast.LENGTH_LONG).show()
//        Snackbar.make(
//            findViewById(android.R.id.content),
//            "Service started!",
//            Snackbar.LENGTH_SHORT
//        ).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service stopped!", Toast.LENGTH_LONG).show()
//        Snackbar.make(
//            findViewById(android.R.id.content),
//            "Service stopped!",
//            Snackbar.LENGTH_SHORT
//        ).show()

    }
}
