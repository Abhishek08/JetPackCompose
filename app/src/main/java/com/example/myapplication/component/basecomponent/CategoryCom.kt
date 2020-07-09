package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems

@Composable
fun CategoryCard(items: SubItemMenu, modifier: Modifier, resoueceId: Int) {
    Column(modifier = modifier.preferredWidth(80.dp).ripple()) {
        Box(
            children = {

                Column {
                    val image = imageResource(id = resoueceId)
                    Card(Modifier.wrapContentSize(Alignment.Center), shape = CircleShape) {

                        Image(
                            asset = image,
                            modifier = Modifier.size(80.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = items.title,
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

val types = listOf(
    com.example.myapplication.R.drawable.fashion_image,
    com.example.myapplication.R.drawable.mobile_images,
    com.example.myapplication.R.drawable.appliances_new,
    com.example.myapplication.R.drawable.pantry,
    com.example.myapplication.R.drawable.kitchen
)

@Composable
fun CategoriesSample(item: SubItems) {

    HorizontalScroller() {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            var subItems = item.subItemMenuList
            for (i in 0 until subItems.size) {
                CategoryCard(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp),
                    resoueceId = types.get(i)
                )
            }
        }
    }
}