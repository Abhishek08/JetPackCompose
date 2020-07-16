package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.ContentScale
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
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import com.example.myapplication.component.response.TopLevelItem
import com.example.myapplication.uigerate.genrateUiFromServerResponse

@Composable
fun TitleBox(listData: List<TopLevelItem>, openDrawer: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            backgroundColor = Color(0xFF5200cc.toInt()),
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

        Surface(color = Color(0xFFf2e6ff.toInt()), modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier.fillMaxSize(), gravity = ContentGravity.Center, children = {
                genrateUiFromServerResponse(listData = listData)
            })
        }
    }

}

@Composable
fun AppDrawer(closeDrawer: () -> Unit) {
    Column(modifier = Modifier.padding(20.dp)) {
        val image = imageResource(id = com.example.myapplication.R.drawable.profile)
        Image(
            asset = image,
            modifier = Modifier.fillMaxWidth().preferredSize(150.dp),
            contentScale = ContentScale.Fit
        )
        Text(text = "Anonymous User", modifier = Modifier.padding(10.dp))
        Text(text = "My Orders", modifier = Modifier.padding(10.dp))
        Text(text = "Settings", modifier = Modifier.padding(10.dp))
        Text(text = "About us", modifier = Modifier.padding(10.dp))
        Button(onClick = closeDrawer, modifier = Modifier.padding(10.dp)) {
            Text(text = "Logout")
        }
    }
}



