package com.example.chatgptdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var diceRollResultTextView: TextView
    private lateinit var rollDiceButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO
        diceRollResultTextView = findViewById(R.id.textView)
        rollDiceButton = findViewById(R.id.button)

        rollDiceButton.setOnClickListener {
            val diceRollResult = (1..6).random()
            diceRollResultTextView.text = "$diceRollResult"
        }
    }
}