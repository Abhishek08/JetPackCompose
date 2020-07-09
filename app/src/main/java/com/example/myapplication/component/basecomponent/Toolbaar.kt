package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.ConstraintLayout
import androidx.ui.layout.ConstraintSet
import androidx.ui.material.IconButton
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.ShoppingCart
import androidx.ui.unit.dp
import com.example.myapplication.component.getColor
import com.example.myapplication.component.response.SubItems

@Composable
fun titleBox() {
    ConstraintLayout(
        constraintSet = ConstraintSet {
        }
    ) {
        TopAppBar(
            backgroundColor = Color.Red,
            elevation = 8.dp,
            title = { Text("JPC Shop", color = Color.White) },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.Menu, tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.ShoppingCart, tint = Color.White)
                }
            }
        )
    }

}

