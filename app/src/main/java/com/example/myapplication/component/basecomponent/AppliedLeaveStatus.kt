package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.IconButton
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.ui.Screen
import com.example.myapplication.ui.navigateTo

@Composable
fun LeaveStatus() {
    VerticalScroller {
        Column() {
            BackButtonStatus()
            AppliedLeaveStatus()
            LeavesTaken()
        }
    }
}

@Composable
fun BackButtonStatus() {
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
fun AppliedLeaveStatus() {
    Card(modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth()) {
        Text(
            text = "Leave Status-India",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
    }
}

@Composable
fun LeavesTaken() {
    Card(modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth()) {
        Text(
            text = "Leave Taken - India",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
    }
    HorizontalScroller() {
        Row()
        {
            Text(
                text = "Leave Type",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.Black
            )
            Text(
                text = "From Date",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.Black
            )
            Text(
                text = "To Date",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.Black
            )
            Text(
                text = "Approved Date",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.Black
            )
            Text(
                text = "Is Half",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.Black
            )
        }
    }
}