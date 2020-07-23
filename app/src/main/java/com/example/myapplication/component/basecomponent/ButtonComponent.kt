package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import com.example.myapplication.component.response.SubItemMenu
import com.example.myapplication.component.response.SubItems


@Composable
fun SimpleButton(onClick: () -> Unit,subItemMenu: SubItems) {
    Button(onClick = {},
        modifier = Modifier.padding(10.dp),
        text= {
            Text(subItemMenu.title,
                modifier = modifierPadding(subItemMenu.metaDataItem.modifier),
                        style = TextStyleCompont(subItemMenu.metaDataItem.textStyle)
            )
        })
}