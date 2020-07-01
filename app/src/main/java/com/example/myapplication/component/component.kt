package com.example.myapplication.component

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.unit.dp


@Composable
fun showTextView(title: String) {

    Text(text = title)
}

@Composable
fun showButton(title: String) {

    Button(
        onClick = {

        },
        modifier = Modifier.padding(16.dp)
    ) { Text(title) }
}