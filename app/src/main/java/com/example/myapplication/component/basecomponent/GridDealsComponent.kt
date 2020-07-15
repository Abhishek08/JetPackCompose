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
import dev.chrisbanes.accompanist.coil.CoilImageWithCrossfade

@Composable
fun GridDealsComponent(title: String, modifier: Modifier, imageUrl: String) {
    Column(modifier = Modifier.preferredWidth(180.dp).ripple()) {
        Box(
            children = {
                Column(modifier = Modifier.padding( 10.dp)) {
                    Card(Modifier.wrapContentSize(Alignment.Center), shape = RoundedCornerShape(10.dp)) {
                        CoilImageWithCrossfade(
                            data = imageUrl,
                            modifier = Modifier.size(150.dp),
                            contentScale = ContentScale.Crop)
                    }
                    Text(
                        text = title,
                        color = Color.DarkGray,
                        modifier = Modifier.padding(top = 8.dp)
                            .gravity(Alignment.CenterHorizontally),
                        style = MaterialTheme.typography.subtitle1,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            })
    }
}

@Composable
fun GridComponent(item: List<SubItemMenu>) {
    val subLists: List<List<SubItemMenu>> = item.chunked(2)
    subLists.forEach {
        println(it)
        Column() {
            if (it.size > 1){
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    for (i in 0 until it.size){
                        GridDealsComponent(
                            title = it.get(i).title,
                            modifier = Modifier.padding(6.dp),
                            imageUrl = it.get(i).url
                        )
                    }
                }
            } else {
                GridDealsComponent(
                    title = it.get(it.lastIndex).title,
                    modifier = Modifier.padding(6.dp),
                    imageUrl = it.get(it.lastIndex).url
                )
            }
        }
    }
}