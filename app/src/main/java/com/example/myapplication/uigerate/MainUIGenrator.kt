package com.example.myapplication.uigerate

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.contentColor
import androidx.ui.layout.Column
import androidx.ui.layout.Spacer
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.unit.dp
import com.example.myapplication.component.basecomponent.*
import com.example.myapplication.component.response.ItemLayoutViewType
import com.example.myapplication.component.response.SubItemViewType
import com.example.myapplication.component.response.SubItems
import com.example.myapplication.component.response.TopLevelItem

@Composable
fun genrateUiFromServerResponse(listData: List<TopLevelItem>) {
    VerticalScroller {
        Column(modifier = Modifier.padding(bottom = 64.dp)) {
            listData.forEachIndexed { index, item ->
                when (item.layoutType) {
                    ItemLayoutViewType.HorizontalScroll -> showServerVerticalLayout(
                        listData = item.listData
                    )
                    ItemLayoutViewType.VerticalScroll -> showServerVerticalLayout(listData = item.listData)
                }
                if (index != listData.size) Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}

@Composable
fun showServerVerticalLayout(listData: List<SubItems>) {
    Column() {
        listData.forEach {
            when (it.subItemViewType) {
                /*SubItemViewType.ToolbarLayout -> {
                    titleBox(it)
                }*/
                SubItemViewType.HeaderLayout -> {
                    Heading(
                        subItemMenu = it,
                        onClick = {})
                }
                SubItemViewType.CardImageWithTextVertical -> {
                    CategoriesSample(item = it)
                }
                SubItemViewType.CardImageWithTextVertical1 -> {
                    HotDealsEvent(item = it)
                }
                SubItemViewType.CardImageWithTextVerticalTrend -> {
                    TopTrendngPicks(item = it)
                }

                SubItemViewType.DividerComponent -> {
                    androidx.ui.material.Divider(
                        thickness = 1.dp,
                        color = contentColor().copy(alpha = 0f)
                    )
                }
                SubItemViewType.ButtonComponent -> {
                    SipmpleButton(onClick={},subItemMenu = it)
                }

                SubItemViewType.CardImageWithTextVerticalSingle -> {
                    Recommended(item = it)
                }

                SubItemViewType.MostLovedBrands -> {
                    ImagePlaceCardWrapContent(item = it)
                }

                SubItemViewType.GameZoneComponent -> {
                    GameZoneUI(item = it)
                }
                /*SubItemViewType.BottomNavigationComponent -> {
                    BottomNavigationSample()
                }*/
            }
        }
    }
}
