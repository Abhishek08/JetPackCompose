package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Image
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.Card
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems


@Composable
fun PlaceCardWrapContent(items: SubItemMenu, modifier: Modifier, resoueceId: Int) {

    Card(
        modifier.preferredSize(width = 150.dp, height = 200.dp).ripple(),
        color = Color.Black,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box( children = {
            val image = imageResource(id = resoueceId)

            Image(
                asset = image,
                modifier = Modifier.preferredSize(width = 150.dp, height = 200.dp),
                contentScale = ContentScale.Crop
            )
        })
    }
}



val eventImage = listOf(
    com.example.myapplication.R.drawable.nike,
    com.example.myapplication.R.drawable.cap_image,
    com.example.myapplication.R.drawable.jeans_image,
    com.example.myapplication.R.drawable.shirts
)

@Composable
fun ImagePlaceCardWrapContent(item: SubItems) {

    HorizontalScroller() {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            var subItems = item.subItemMenuList
            for (i in 0 until subItems.size) {
                PlaceCardWrapContent(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp),
                    resoueceId = eventImage.get(i)
                )
            }
        }
    }
}