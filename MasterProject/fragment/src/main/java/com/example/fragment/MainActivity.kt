package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragmentA)
            .commit()
    }
}