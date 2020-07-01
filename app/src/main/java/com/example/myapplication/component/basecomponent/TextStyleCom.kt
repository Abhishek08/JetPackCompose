package com.example.myapplication.component.basecomponent

import androidx.ui.text.TextStyle
import androidx.ui.unit.sp
import com.example.myapplication.component.getColor
import com.example.myapplication.component.response.TextStyleLayout

fun TextStyleCompont(textStyleLayout: TextStyleLayout): TextStyle {
    return TextStyle(fontSize = textStyleLayout.textSize.sp, color = getColor(textStyleLayout.color))
}