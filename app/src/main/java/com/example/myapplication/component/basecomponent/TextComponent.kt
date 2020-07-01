package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.layout.RowScope.weight
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButton
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems


@Composable
fun NormalText(subItemMenu: SubItemMenu) {
    Text(
        text = "subItemMenu.title",
        style = TextStyleCompont(subItemMenu.metaDataItem.textStyle),
        modifier = modifierPadding(subItemMenu.metaDataItem.modifier)
    )
}

@Composable
fun Heading(subItemMenu: SubItems, onClick: () -> Unit) {

    Row(
        modifier = Modifier.fillMaxWidth() + Modifier.padding(4.dp),
        horizontalArrangement = Arrangement
            .SpaceBetween
    ) {

        var data = subItemMenu.subItemMenuList
        data.forEach {
            Text(
                text = it.title,
                style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.SemiBold),
                modifier = Modifier.padding(end = 16.dp)
            )
        }

    }

}

//@Composable
//fun TextButtonLayout(title: String, modifier: Modifier, style: TextStyle, onClick: () -> Unit) {
//    TextButton(onClick = onClick) {
//        NormalText(
//            title = title,
//            modifier = modifier,
//            style = style
//        )
//    }
//}