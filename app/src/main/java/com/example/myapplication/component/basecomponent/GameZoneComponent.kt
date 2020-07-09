package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems

@Composable
fun GameZoneComponent(items: SubItemMenu, modifier: Modifier, resourceId: Int){
    Column {
        Box(children = {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Row() {
                    val image = imageResource(id = resourceId)
                    Image(
                        asset = image,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.padding(8.dp).preferredHeightIn(maxHeight = 60.dp).preferredWidthIn(maxWidth = 60.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )

                    Column() {
                        Text(
                            text = items.title,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 12.dp).padding(start = 4.dp).padding(end = 16.dp)
                                .gravity(Alignment.CenterHorizontally),
                            style = TextStyle(
                                fontSize = (16.sp),
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Bold
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = items.title,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 4.dp).padding(start = 4.dp).padding(end = 16.dp),
                            style = TextStyle(
                                fontSize = (12.sp),
                                fontStyle = FontStyle.Normal
                            ),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Button(onClick = {},
                    modifier = Modifier.preferredWidth(60.dp).preferredHeight(30.dp).gravity(Alignment.CenterVertically).clip(
                        RoundedCornerShape(10.dp)),
                    text= {
                        Text("Play",
                        style = TextStyle(fontSize = (12.sp), fontStyle = FontStyle.Normal, fontWeight = FontWeight.Bold))
                    })
            }
        })
    }
}

val games = listOf(
    com.example.myapplication.R.drawable.sale_new,
    com.example.myapplication.R.drawable.mobile_images,
    com.example.myapplication.R.drawable.appliances_new,
    com.example.myapplication.R.drawable.pantry,
    com.example.myapplication.R.drawable.kitchen
)

@Composable
fun GameZoneUI(item: SubItems) {
    VerticalScroller() {
        Column(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
            val subItems = item.subItemMenuList
            for (i in 0 until subItems.size) {
                GameZoneComponent(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp),
                    resourceId = games.get(i)
                )
            }
        }
    }
}