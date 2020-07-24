package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.Card
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
            Screen.LoginScreen
        )
    }, modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)) {
        Modifier.preferredSize(24.dp)
        Icon(Icons.Filled.ArrowBack, tint = Color.Black)
    }
}

@Composable
fun LeaveRequest() {
    Column() {


        Card(
            modifier = Modifier.padding(15.dp) +Modifier.fillMaxWidth(),
            color = Color.Blue
        ) {
            Text(
                text = "Leave Management",
                modifier = Modifier.padding(start = 80.dp,top = 15.dp,bottom = 15.dp,end = 15.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                maxLines = 1,
                color = Color.White
            )
        }
        Box(modifier = Modifier.ripple(bounded = true) + Modifier.clickable(onClick = {
            navigateTo(
                Screen.LeaveApplicationScreen
            )
        }), children = {
            Card(
                modifier = Modifier.padding(15.dp),
                color = Color.Gray
            ) {
                Text(
                    text = "Request Leave",
                    modifier = Modifier.padding(15.dp),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                    maxLines = 1,
                    color = Color.White
                )
            }
        })
        Box(modifier = Modifier.ripple(bounded = true) + Modifier.clickable(onClick = {
            navigateTo(
                Screen.AppliedLeaveStatusScreen
            )
        }), children = {

            Card(
                modifier = Modifier.padding(start = 15.dp, top = 10.dp),
                color = Color.Gray
            ) {
                Text(
                    text = "Applied Leaves",
                    modifier = Modifier.padding(15.dp),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                    maxLines = 1,
                    color = Color.White
                )
            }
        })
    }
}

@Composable
@Preview
fun displayPreview() {
    LeaveRequest()
}