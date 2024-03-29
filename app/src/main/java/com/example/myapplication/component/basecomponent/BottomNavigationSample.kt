package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.BottomNavigation
import androidx.ui.material.BottomNavigationItem
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.*
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems

@Composable
fun BottomNavigationSample() {
    val selectedItem = state { 0 }
    val items = listOf(
        NavigationItem("Home", Icons.Outlined.Home),
        NavigationItem("Categories", Icons.Outlined.Search),
        NavigationItem("Cart", Icons.Outlined.ShoppingCart),
        NavigationItem("Profile", Icons.Outlined.Face)
    )
    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Spacer(modifier = Modifier.preferredHeight(64.dp))
        BottomNavigation(
            backgroundColor = Color(0xFF5200cc.toInt()),
            elevation = 16.dp
        ) {
            items.forEachIndexed { index, item ->
                BottomNavigationItem(
                    icon = { Icon(item.icon) },
                    text = { Text(text = item.name) },
                    selected = selectedItem.value == index,
                    onSelected = { selectedItem.value = index },
                    activeColor = Color.White,
                    inactiveColor = Color.LightGray
                )
            }
        }
    }
}

data class NavigationItem(
    val name: String,
    val icon: VectorAsset
)

/*
@Composable
fun BottomNavigationUI(item: SubItems) {
    val subItems = item.subItemMenuList
    for (i in 0 until subItems.size) {
        BottomNavigationSample(
            items = subItems.get(i),
            modifier = Modifier.padding(0.dp),
            onClick = {}
        )
    }
}*/
