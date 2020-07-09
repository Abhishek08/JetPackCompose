package com.example.myapplication.component.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MainServerResponse(@SerializedName("data") val listData: List<TopLevelItem>) :
    Serializable

data class TopLevelItem(
    @SerializedName("viewType") val layoutType: ItemLayoutViewType,
    @SerializedName("metaData") val metaDataItem: MetaDataItem,
    @SerializedName("data") val listData: List<SubItems>
) : Serializable

data class MetaDataItem(
    @SerializedName("Modifier") val modifier: ModifierData,
    @SerializedName("TextStyle") val textStyle: TextStyleLayout
) : Serializable

data class ModifierData(@SerializedName("padding") val padding: Int) : Serializable

data class TextStyleLayout(
    @SerializedName("textSize") val textSize: Int,
    @SerializedName("textColor") val color: String,
    @SerializedName("textStyle") val textStyle: String
) : Serializable

data class SubItems(
    @SerializedName("viewType") val subItemViewType: SubItemViewType,
    @SerializedName("title") val title: String,
    @SerializedName("metaData") val metaDataItem: MetaDataItem,
    @SerializedName("items") val subItemMenuList: List<SubItemMenu>
) : Serializable

data class SubItemMenu(
    @SerializedName("viewType") val subItemViewType: SubItemViewType,
    @SerializedName("title") val title: String,
    @SerializedName("subtitle") val subtitle: String,
    @SerializedName("imageUrl") val url: String,
    @SerializedName("metaData") val metaDataItem: MetaDataItem
) : Serializable

enum class ItemLayoutViewType {
    @SerializedName("horizontalScroll")
    HorizontalScroll,

    @SerializedName("verticalScroll")
    VerticalScroll
}

enum class SubItemViewType {
    @SerializedName("ToolbarLayout")
    ToolbarLayout,

    @SerializedName("HeaderLayout")
    HeaderLayout,

    @SerializedName("TextLayout")
    TextLayout,

    @SerializedName("CategoryImageWithText")
    CardImageWithTextVertical,

    @SerializedName("TextWithImage")
    TextWithImage,

    @SerializedName("DividerComponent")
    DividerComponent,

    @SerializedName("ButtonComponent")
    ButtonComponent,

    @SerializedName("CategoryImageWithText1")
    CardImageWithTextVertical1,

    @SerializedName("CategoryImageWithTextTrend")
    CardImageWithTextVerticalTrend,

    @SerializedName("CategoryImageWithSingleText")
    CardImageWithTextVerticalSingle,

    @SerializedName("MostLovedBrands")
    MostLovedBrands,

    @SerializedName("BottomNavigationComponent")
    BottomNavigationComponent,

    @SerializedName("GameZoneComponent")
    GameZoneComponent
}