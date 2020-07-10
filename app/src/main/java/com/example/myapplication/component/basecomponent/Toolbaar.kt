package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.compose.MutableState
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.IconButton
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.Notifications
import androidx.ui.material.icons.filled.ShoppingCart
import androidx.ui.unit.dp
import com.example.myapplication.component.getColor
import com.example.myapplication.component.response.SubItems
import com.example.myapplication.component.response.TopLevelItem
import com.example.myapplication.uigerate.genrateUiFromServerResponse

@Composable
fun TitleBox(listData: List<TopLevelItem>, openDrawer: () -> Unit ) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            backgroundColor = Color.Red,
            elevation = 8.dp,
            title = { Text("JPC Shop", color = Color.White) },
            navigationIcon = {
                IconButton(onClick = openDrawer) {
                    Icon(asset = Icons.Default.Menu, tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.Notifications, tint = Color.White)
                }
            }
        )

        Surface(color = Color(0xFFffd7d7.toInt()), modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier.fillMaxSize(), gravity = ContentGravity.Center, children = {
                genrateUiFromServerResponse(listData = listData)
            })
        }
    }

}

@Composable
fun AppDrawer(closeDrawer: () -> Unit ) {
    Column(modifier = Modifier.padding(20.dp)) {
        Button(onClick = closeDrawer) {
            Text(text = "Click me to close")
        }
        Text(text = "Anonymous User")
        Text(text = "My Orders")
        Text(text = "Settings")
        Text(text = "About us")
        Text(text = "Logout")
    }
}

enum class DrawerAppScreen {
    Screen1,
    Screen2,
    Screen3
}


