package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.IconButton
import androidx.ui.material.Surface
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
        Surface(color = Color.White) {
            Column {
                BackButtonStatus()
                AppliedLeaveStatus()
                Divider(thickness = 5.dp, modifier = Modifier.padding(top = 20.dp))
                LeavesTaken()
            }
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
    Card(modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth(),color = Color.Blue) {
        Text(
            text = "Leave Status-India",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp,bottom = 10.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.White
        )
    }

    Column {


        HorizontalScroller() {
            Row()
            {
                Card(
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                    color = Color.Gray
                ) {
                    Text(
                        text = "    --------------------------   ",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 5.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp), color = Color.Gray) {
                    Text(
                        text = "Casual Leave",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.Gray) {
                    Text(
                        text = "Sick Leave",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.Gray) {
                    Text(
                        text = "Privilege Leave",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }

            }
        }




        HorizontalScroller() {
            Row()
            {
                Card(
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                    color = Color.White
                ) {
                    Text(
                        text = "Carry Forward Leave",
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
                        text = "      N.A          ",
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
                        text = "     3.0      ",
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
                        text = "            7.0     ",
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

        Card(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
            color = Color.White
        ) {
            Text(
                text = "Current Year Leave",
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

        Card(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
            color = Color.White
        ) {
            Text(
                text = "Total",
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

        Card(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
            color = Color.White
        ) {
            Text(
                text = "Leave Taken",
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

        Card(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
            color = Color.White
        ) {
            Text(
                text = "Leave Applied",
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

        Card(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
            color = Color.White
        ) {
            Text(
                text = "Available Balance",
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

    }

}

@Composable
fun LeavesTaken() {
    Card(modifier = Modifier.padding(20.dp) + Modifier.fillMaxWidth(),color = Color.Blue) {
        Text(
            text = "Leave Taken - India",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp,bottom = 10.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.White
        )
    }
    Column {


        HorizontalScroller() {
            Row()
            {
                Card(
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                    color = Color.Gray
                ) {
                    Text(
                        text = "Leave Type",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 10.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp), color = Color.Gray) {
                    Text(
                        text = "From Date",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.Gray) {
                    Text(
                        text = "To Date",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(modifier = Modifier.padding(top = 15.dp, start = 5.dp), color = Color.Gray) {
                    Text(
                        text = "Approved Date",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
                Card(
                    modifier = Modifier.padding(top = 15.dp, end = 15.dp, start = 5.dp),
                    color = Color.Gray
                ) {
                    Text(
                        text = "Is Half",
                        modifier = Modifier.padding(
                            top = 10.dp,
                            start = 16.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        ),
                        style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                        maxLines = 1,
                        color = Color.White
                    )
                }
            }
        }



        HorizontalScroller() {
            Row()
            {
                Card(
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                    color = Color.White
                ) {
                    Text(
                        text = "Sick Leave",
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
                        text = "30/12/2019",
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
                        text = "31/12/2019",
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
                        text = "02/01/2020",
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
                        text = "Yes",
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


        HorizontalScroller() {
            Row()
            {
                Card(
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp, end = 5.dp),
                    color = Color.White
                ) {
                    Text(
                        text = "Casual Leave",
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
                        text = "30/12/2019",
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
                        text = "31/12/2019",
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
                        text = "02/01/2020",
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
                        text = "Yes",
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

}