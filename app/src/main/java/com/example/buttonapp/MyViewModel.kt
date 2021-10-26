package com.example.buttonapp

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var number = 0

    fun updateNumber(add: Boolean){
        if(add){
            number++
        }else{
            number--
        }
    }
}