package com.example.mysidebarwork.ui.fishinglocation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FishingLocationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Fishing location Fragment"
    }
    val text: LiveData<String> = _text
}