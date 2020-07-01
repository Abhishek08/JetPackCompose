package com.example.myapplication.component

import androidx.ui.graphics.Color
import com.example.myapplication.ui.red
import com.example.myapplication.ui.teal200
import com.example.myapplication.ui.white

fun getColor(color: String): Color {
    return when (color) {
        "red" -> red
        "white" -> red
        else -> white
    }
}