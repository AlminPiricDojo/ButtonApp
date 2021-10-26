package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private val myViewModel by lazy { ViewModelProvider(this).get(MyViewModel::class.java) }

    private lateinit var numberTxt: TextView
    private lateinit var minusBtn: Button
    private lateinit var plusBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTxt = findViewById(R.id.tvNumber)
        numberTxt.text = myViewModel.number.toString()
        minusBtn = findViewById(R.id.btnMinus)
        plusBtn = findViewById(R.id.btnPlus)

        minusBtn.setOnClickListener {
            myViewModel.updateNumber(false)
            numberTxt.text = myViewModel.number.toString()
        }

        plusBtn.setOnClickListener {
            myViewModel.updateNumber(true)
            numberTxt.text = myViewModel.number.toString()
        }
    }

}