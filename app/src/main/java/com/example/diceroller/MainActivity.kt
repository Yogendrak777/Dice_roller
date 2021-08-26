package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
                rollDice()

        }
    }
    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        val diceimage : ImageView = findViewById(R.id.imageView)
        when(diceRoll){
            1->diceimage.setImageResource(R.drawable.dice_1)
            2->diceimage.setImageResource(R.drawable.dice_2)
            3->diceimage.setImageResource(R.drawable.dice_3)
            4->diceimage.setImageResource(R.drawable.dice_4)
            5->diceimage.setImageResource(R.drawable.dice_5)
            6->diceimage.setImageResource(R.drawable.dice_6)
        }
        diceimage.contentDescription = diceRoll.toString()

    }
}