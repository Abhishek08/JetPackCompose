package com.example.myapplication.ui.landing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.GetAllLayutRepositoty
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(var layoutRepositoty: GetAllLayutRepositoty) : ViewModel() {

    val successResponse = layoutRepositoty._state

    fun getLayout() {
        viewModelScope.launch {
            layoutRepositoty.getAllLayout()
        }
    }


}