package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.layout.Row
import androidx.ui.text.TextStyle
import com.example.myapplication.component.response.SubItemViewType
import com.example.myapplication.component.response.SubItems

@Composable
fun TitleWithViewAll(subIte: SubItems, onClick: () -> Unit) {
    Row(
        verticalGravity = Alignment.CenterVertically,
        modifier = modifierPadding(subIte.metaDataItem.modifier)
    ) {
        var subItemMenu = subIte.subItemMenuList

        subItemMenu.forEach {
            when (it.subItemViewType) {
                SubItemViewType.TextLayout -> {
                    NormalText(it)
                }
            }
        }

    }
}