package com.example.architecturecomponents

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var count = 0
    var countLiveDataObject = MutableLiveData<Int>(count)

    val countLiveData : LiveData<Int>
    get() = countLiveDataObject


    fun increment() {
        countLiveDataObject.value = count++
    }
}