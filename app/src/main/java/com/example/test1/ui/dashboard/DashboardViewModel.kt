package com.example.test1.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "직접입력 :"
    }
    private val _editText = MutableLiveData<String>().apply {

    }
    val text: LiveData<String> = _text
}