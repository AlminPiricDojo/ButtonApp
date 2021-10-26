package com.example.buttonapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {
    private var number: MutableLiveData<Int> = MutableLiveData()

    init {
        number.postValue(0)
    }

    fun getNumber(): LiveData<Int>{
        return number
    }

    fun updateNumber(add: Boolean){
        GlobalScope.launch(Main) {
            Log.d("ViewModel", "Waiting...")
            delay(2000)
            if(add){
                number.postValue(number.value!! + 1)
            }else{
                number.postValue(number.value!! - 1)
            }
        }
    }
}