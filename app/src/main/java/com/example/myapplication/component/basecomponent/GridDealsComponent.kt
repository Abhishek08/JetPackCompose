package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.layout.ColumnScope.gravity
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems

@Composable
fun GridDealsComponent(title: String, modifier: Modifier, resourceId: Int) {
    Column(modifier = Modifier.preferredWidth(180.dp).ripple()) {
        Box(
            children = {
                Column(modifier = Modifier.padding( 10.dp)) {
                    val image = imageResource(id = resourceId)
                    Card(Modifier.wrapContentSize(Alignment.Center), shape = RoundedCornerShape(10.dp)) {
                        Image(
                            asset = image,
                            modifier = Modifier.size(150.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = title,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 8.dp)
                            .gravity(Alignment.CenterHorizontally),
                        style = MaterialTheme.typography.body2,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            })
    }
}



val gridDeals= listOf(
    com.example.myapplication.R.drawable.fashion_image,
    com.example.myapplication.R.drawable.mobile_images,
    com.example.myapplication.R.drawable.appliances_new,
    com.example.myapplication.R.drawable.pantry,
    com.example.myapplication.R.drawable.kitchen
)

@Composable
fun GridComponent(item: List<SubItemMenu>) {
    println(item)
    val subLists: List<List<SubItemMenu>> = item.chunked(2)
    subLists.forEach {
        println(subLists)
        Column() {
            if (it.size > 1){
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    for (i in 0 until it.size){
                        GridDealsComponent(
                            title = it.get(i).title,
                            modifier = Modifier.padding(6.dp),
                            resourceId = gridDeals.get(i)
                        )
                    }
                }
            } else {
                GridDealsComponent(
                    title = it.get(it.lastIndex).title,
                    modifier = Modifier.padding(6.dp),
                    resourceId = gridDeals.get(it.lastIndex)
                )
            }
        }
    }
}