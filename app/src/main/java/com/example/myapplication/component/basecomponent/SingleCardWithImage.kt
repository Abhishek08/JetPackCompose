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
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems


@Composable
fun PlaceCardFullWidth(items: SubItemMenu, modifier: Modifier, resoueceId:  Int) {
    Column(modifier = modifier.fillMaxWidth().ripple()) {
        Box(
            children = {
                Column {
                    val image = imageResource(id = resoueceId)
                    Image(
                        asset = image,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.preferredHeightIn(maxHeight = 180.dp).fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                    )

                    Column() {

                        Text(
                            text = items.title,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 16.dp)
                                .gravity(Alignment.CenterHorizontally),
                            style = TextStyle(
                                fontSize = (25.sp),
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Bold
                            ),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )

                    }

                }

            })
    }
}


val pages = listOf(
    com.example.myapplication.R.drawable.sale_new,
    com.example.myapplication.R.drawable.mobile_images,
    com.example.myapplication.R.drawable.appliences_new,
    com.example.myapplication.R.drawable.pantry,
    com.example.myapplication.R.drawable.kitchen
)

@Composable
fun Recommended(item: SubItems) {
    VerticalScroller() {
        Column(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
            val subItems=item.subItemMenuList
          for (i in 0 until subItems.size){
                PlaceCardFullWidth(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp),
                    resoueceId = pages.get(0))
            }
        }
    }
}

