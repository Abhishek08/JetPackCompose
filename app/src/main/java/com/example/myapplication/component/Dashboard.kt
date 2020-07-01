package com.example.myapplication.component

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.Search
import androidx.ui.unit.dp
import com.example.myapplication.data.response.ItemViewType
import com.example.myapplication.data.response.Items
import com.example.myapplication.data.response.SubItemViewType

@Composable
fun showDashboard(data: List<Items>) {
    VerticalScroller {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            data.forEachIndexed { index, item ->
                when (item.viewType) {
                    ItemViewType.HorizontalScroll -> showHorizontalElements(
                        items = item
                    )
                    ItemViewType.VerticalScroll -> showVerticalElements(items = item)
                }
                if (index != data.size) Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}


@Composable
fun showVerticalElements(items: Items) {
    Column() {
        items.list.forEach {
            when (it.viewType) {
                SubItemViewType.ButtonLayout -> {
                    showButton(title = it.title.toString())
                }
                SubItemViewType.TextLayout -> {
                    showTextView(title = it.title.toString())
                }

                SubItemViewType.ImageLayout -> {

                }
            }
        }
    }
}


@Composable
fun SimpleTopAppBarSample() {
    Scaffold(
        topAppBar = {
            TopAppBar(
                backgroundColor = Color.Red,
                elevation = 8.dp,
                title = { Text("Atividades", color = Color.White) },
                navigationIcon = { IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.Menu, tint = Color.White) }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(asset = Icons.Default.Search, tint = Color.White)
                    }
                }
            )
        },
        bodyContent = { /* "bodyContent" é obrigatório */ }
    )
}



@Composable
fun showHorizontalElements(items: Items) {
    HorizontalScroller(modifier = Modifier.fillMaxSize()) {
        Row() {
            items.list.forEach {
                when (it.viewType) {
                    SubItemViewType.ButtonLayout -> {
                        showButton(title = it.title.toString())
                    }
                    SubItemViewType.TextLayout -> {
                        showTextView(title = it.title.toString())
                    }

                    SubItemViewType.ImageLayout -> {

                    }
                }
            }
        }

    }
}