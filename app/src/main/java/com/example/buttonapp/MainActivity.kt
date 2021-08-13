package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number = 0

    private lateinit var numberTxt: TextView
    private lateinit var minusBtn: Button
    private lateinit var plusBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTxt = findViewById(R.id.tvNumber)
        minusBtn = findViewById(R.id.btnMinus)
        plusBtn = findViewById(R.id.btnPlus)

        minusBtn.setOnClickListener {
            updateNumber(false)
        }

        plusBtn.setOnClickListener {
            updateNumber(true)
        }
    }

    private fun updateNumber(add: Boolean){
        if(add){
            number++
        }else{
            number--
        }
        numberTxt.text = number.toString()
    }
}