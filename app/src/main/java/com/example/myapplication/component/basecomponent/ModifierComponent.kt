package com.example.myapplication.component.basecomponent

import androidx.ui.core.Modifier
import androidx.ui.layout.padding
import androidx.ui.unit.dp
import com.example.myapplication.component.response.ModifierData


fun modifierPadding(modifierData: ModifierData): Modifier {
    return Modifier.apply {
        padding(
            start = modifierData.padding.dp,
            end = modifierData.padding.dp,
            top = modifierData.padding.dp,
            bottom = modifierData.padding.dp
        )
    }
}