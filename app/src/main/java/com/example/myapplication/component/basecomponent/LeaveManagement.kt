package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.IconButton
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.material.ripple.ripple
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.ui.Screen
import com.example.myapplication.ui.navigateTo

@Composable
fun LeaveManagement() {
    VerticalScroller {
        Column {
            BackButtonNew()
            LeaveRequest()
        }
    }
}

@Composable
fun BackButtonNew() {
    IconButton(onClick = {
        navigateTo(
            Screen.LeaveManagementScreen
        )
    }, modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)) {
        Modifier.preferredSize(24.dp)
        Icon(Icons.Filled.ArrowBack, tint = Color.Black)
    }
}

@Composable
fun LeaveRequest() {
    Box(modifier = Modifier.ripple(bounded = true) + Modifier.clickable(onClick = {
        navigateTo(
            Screen.LeaveApplicationScreen
        )
    }), children = {
        Text(
            text = "Request Leave",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
    })
    Box(modifier = Modifier.ripple(bounded = true) + Modifier.clickable(onClick = {
        navigateTo(
            Screen.AppliedLeaveStatusScreen
        )
    }), children = {
        Text(
            text = "Applied Leaves",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
    })
}

@Composable
@Preview
fun displayPreview() {
    LeaveRequest()
}