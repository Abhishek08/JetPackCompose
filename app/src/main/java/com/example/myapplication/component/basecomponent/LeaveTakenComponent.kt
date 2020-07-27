package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.material.Card
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.model.LeaveInfo



@Composable
fun LeaveTakenComponent(leaveInfo: LeaveInfo) {
    HorizontalScroller {
        Row()
        {
            Card(
                modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                color = Color.White
            ) {
                Text(
                    text = leaveInfo.leaveType,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp,
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                    maxLines = 1,
                    color = Color.Black
                )
            }
            Card(modifier = Modifier.padding(top = 15.dp), color = Color.White) {
                Text(
                    text = leaveInfo.fromDate,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 16.dp,
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                    maxLines = 1,
                    color = Color.Black
                )
            }
            Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.White) {
                Text(
                    text = leaveInfo.toDate,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 16.dp,
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                    maxLines = 1,
                    color = Color.Black
                )
            }
            Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.White) {
                Text(
                    text = leaveInfo.purpose,
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 16.dp,
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                    maxLines = 1,
                    color = Color.Black
                )
            }
            Card(
                modifier = Modifier.padding(top = 15.dp, end = 15.dp, start = 5.dp),
                color = Color.White
            ) {
                Text(
                    text = leaveInfo.isHalfDayLeave.toString(),
                    modifier = Modifier.padding(
                        top = 10.dp,
                        start = 16.dp,
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                    style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Italic,
                    maxLines = 1,
                    color = Color.Black
                )
            }
        }
    }
}