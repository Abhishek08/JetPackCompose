package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.Card
import androidx.ui.material.ripple.ripple
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems
import dev.chrisbanes.accompanist.coil.CoilImageWithCrossfade


@Composable
fun PlaceCardWrapContent(items: SubItemMenu, modifier: Modifier) {

    Card(
        modifier.preferredSize(width = 150.dp, height = 180.dp).ripple(),
        color = Color.Black,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(children = {
            CoilImageWithCrossfade(
                data = items.url,
                modifier = Modifier.preferredSize(width = 180.dp, height = 180.dp),
                contentScale = ContentScale.Crop
            )
        })
    }
}

@Composable
fun ImagePlaceCardWrapContent(item: SubItems) {

    HorizontalScroller {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            var subItems = item.subItemMenuList
            for (i in 0 until subItems.size) {
                PlaceCardWrapContent(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp)
                )
            }
        }
    }
}