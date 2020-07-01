package com.example.myapplication.data.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ServerUi(@SerializedName("data") var listData:List<Items>): Serializable

data class Items(val viewType: ItemViewType, @SerializedName("data") var list: List<SubItem>): Serializable

data class SubItem(
    val viewType: SubItemViewType,
    val imageUrl: String,
    val title: String?,
    val subTitle: String?
): Serializable

enum class ItemViewType {
    @SerializedName("horizontalScroll")
    HorizontalScroll,

    @SerializedName("verticalScroll")
    VerticalScroll
}

enum class SubItemViewType {
    @SerializedName("TextLayout")
    TextLayout,

    @SerializedName("ButtonLayout")
    ButtonLayout,

    @SerializedName("ImageLayout")
    ImageLayout
}