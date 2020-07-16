package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems
import dev.chrisbanes.accompanist.coil.CoilImageWithCrossfade


@Composable
fun TrendingCard(items: SubItemMenu, modifier: Modifier) {
    Column(modifier = modifier.preferredWidth(380.dp).ripple()) {
        Box(
            children = {

                Column {
                    Card(Modifier.wrapContentSize(Alignment.Center)) {
                        CoilImageWithCrossfade(
                            data = items.url,
                            modifier = Modifier.fillMaxWidth().preferredSize(200.dp),
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

@Composable
fun TopTrendingPicks(item: SubItems) {

    HorizontalScroller {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            var subItems = item.subItemMenuList
            for (i in 0 until subItems.size) {
                TrendingCard(
                    items = subItems.get(i),
                    modifier = Modifier.padding(6.dp)
                )
            }
        }
    }
}