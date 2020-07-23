package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.ui.Screen
import com.example.myapplication.ui.navigateTo


@Composable
fun LeaveApplication() {

    VerticalScroller {

        Surface(color = Color.White) {
            Column {
                BackButton()
                LeaveDetails()
                Divider(thickness = 5.dp)
                LeaveRequestForm()
                LeaveDates()
                Divider(thickness = 5.dp, modifier = Modifier.padding(top = 8.dp))
                ContactDetails()
                Divider(thickness = 5.dp, modifier = Modifier.padding(top = 8.dp, bottom = 5.dp))
            }
        }
    }
}

@Composable
fun BackButton() {
    IconButton(onClick = {
        navigateTo(
            Screen.LeaveManagementScreen
        )
    }, modifier = Modifier.padding(top = 5.dp, bottom = 1.dp)) {
        Modifier.preferredSize(24.dp)
        Icon(Icons.Filled.ArrowBack, tint = Color.Black)
    }
}

@Composable
fun LeaveDetails() {
    Text(
        text = "Request Leave",
        modifier = Modifier.padding(start = 110.dp),
        style = TextStyle(fontSize = 25.sp,color = Color.Blue), fontStyle = FontStyle.Normal,
        maxLines = 1,
        color = Color.Black
    )
    Card(modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth(), color = Color.Blue) {
        Text(
            text = "Leave Status",
            modifier = Modifier.padding(top = 15.dp, start = 16.dp, bottom = 10.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.White
        )
    }
    Card(modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth(), color = Color.Blue) {
        Text(
            text = "Associate Available Leave",
            modifier = Modifier.padding(top = 10.dp, start = 16.dp, bottom = 10.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.White
        )
    }
}

@Composable
fun LeaveRequestForm() {
    Column() {
        Card(
            modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth(),
            color = Color.Blue
        ) {
            Text(
                text = "Leave",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp,bottom = 10.dp),
                style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
                maxLines = 1,
                color = Color.White
            )
        }
        Row() {
            Text(
                text = "Leave Type :",
                modifier = Modifier.padding(top = 20.dp, start = 16.dp),
                style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp,
                maxLines = 1,
                color = Color.Black
            )
            Surface(
                color = Color.LightGray,
                modifier = Modifier.padding(start = 5.dp, top = 10.dp, end = 20.dp)
            ) {
                var textValue by state { TextFieldValue(" ") }
                TextField(value = textValue,
                    modifier = Modifier.padding(10.dp),
                    // Update value of textValue with the latest value of the text field
                    onValueChange = {
                        textValue = it
                    }
                )
            }
        }
        Text(
            text = "Number of Days: N.A",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp),
            style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp,
            maxLines = 1,
            color = Color.Black
        )
    }
}

@Composable
fun MaterialCheckboxComponent() {
    var checked by state { false }
    //  Card(modifier = Modifier.padding(10.dp),color = Color.LightGray) {
    Row(modifier = Modifier.padding(12.dp)) {

        Checkbox(checked = checked,
            onCheckedChange = {
                checked = !checked
            })
        Text(text = "Half Leave", modifier = Modifier.padding(start = 8.dp), style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp)
    }
    //  }
}

@Composable
fun LeaveDates() {
    Row {
        Text(
            text = "From Date:",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp),
            maxLines = 1,
            color = Color.Black,
            style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
        )
        Surface(
            color = Color.LightGray,
            modifier = Modifier.padding(start = 13.dp, top = 10.dp, end = 20.dp)
        ) {
            var textValue by state { TextFieldValue(" ") }
            TextField(value = textValue,
                modifier = Modifier.padding(10.dp),
                // Update value of textValue with the latest value of the text field
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
    Row {
        Text(
            text = "To Date:",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp),
            maxLines = 1,
            color = Color.Black,
            style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
        )
        Surface(
            color = Color.LightGray,
            modifier = Modifier.padding(start = 31.dp, top = 10.dp, end = 20.dp)
        ) {
            var textValue by state { TextFieldValue(" ") }
            TextField(value = textValue,
                modifier = Modifier.padding(10.dp),
                // Update value of textValue with the latest value of the text field
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
    MaterialCheckboxComponent()
    Row {
        Text(
            text = "Purpose:",
            modifier = Modifier.padding(top = 15.dp, start = 16.dp),
            maxLines = 1,
            color = Color.Black,
            style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
        )
        Surface(
            color = Color.LightGray,
            modifier = Modifier.padding(start = 27.dp, top = 10.dp, end = 20.dp, bottom = 5.dp)
        ) {
            var textValue by state { TextFieldValue(" ") }
            TextField(value = textValue,
                modifier = Modifier.padding(40.dp),
                // Update value of textValue with the latest value of the text field
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
}

@Composable
fun ContactDetails() {
    Column() {
        Card(
            modifier = Modifier.padding(15.dp) + Modifier.fillMaxWidth(),
            color = Color.Blue
        ) {
            Text(
                text = "Contact Details While On Leave",
                modifier = Modifier.padding(top = 10.dp, start = 16.dp,bottom = 10.dp),
                style = TextStyle(fontSize = 25.sp), fontStyle = FontStyle.Normal,fontSize = 20.sp,
                maxLines = 1,
                color = Color.White
            )
        }
        Row() {
            Text(
                text = "Address:",
                modifier = Modifier.padding(top = 20.dp, start = 16.dp),
                maxLines = 1,
                color = Color.Black,
                style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
            )
            Surface(
                color = Color.LightGray,
                modifier = Modifier.padding(start = 35.dp, top = 10.dp, end = 20.dp, bottom = 5.dp)
            ) {
                var textValue by state { TextFieldValue(" ") }
                TextField(value = textValue,
                    modifier = Modifier.padding(40.dp),
                    // Update value of textValue with the latest value of the text field
                    onValueChange = {
                        textValue = it
                    }
                )
            }
        }

        Row {
            Text(
                text = "Email:",
                modifier = Modifier.padding(top = 20.dp, start = 16.dp),
                maxLines = 1,
                color = Color.Black,
                style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
            )
            Surface(
                color = Color.LightGray,
                modifier = Modifier.padding(start = 55.dp, top = 10.dp, end = 20.dp)
            ) {
                var textValue by state { TextFieldValue(" ") }
                TextField(value = textValue,
                    modifier = Modifier.padding(10.dp),
                    // Update value of textValue with the latest value of the text field
                    onValueChange = {
                        textValue = it
                    }
                )
            }
        }

        Row {
            Text(
                text = "Contact No:",
                modifier = Modifier.padding(top = 20.dp, start = 16.dp, end = 5.dp),
                maxLines = 1,
                color = Color.Black,
                style = TextStyle(fontStyle = FontStyle.Normal),fontSize = 15.sp
            )
            Surface(
                color = Color.LightGray,
                modifier = Modifier.padding(start = 12.dp, top = 10.dp, end = 20.dp)
            ) {
                var textValue by state { TextFieldValue(" ") }
                TextField(value = textValue,
                    modifier = Modifier.padding(10.dp),
                    // Update value of textValue with the latest value of the text field
                    onValueChange = {
                        textValue = it
                    }
                )
            }
        }
        Divider(thickness = 5.dp, modifier = Modifier.padding(top = 8.dp, bottom = 5.dp))

        Row {
            Button(onClick = {},
                modifier = Modifier.padding(start = 16.dp, top = 10.dp),backgroundColor= Color.Blue ,
                text = {
                    Text(
                        "Submit",
                        modifier = Modifier.padding(10.dp),
                        style = TextStyle(color = Color.White)
                    )
                })

            Button(onClick = {},
                modifier = Modifier.padding(start = 16.dp, top = 10.dp),backgroundColor= Color.Blue ,
                text = {
                    Text(
                        "Reset",
                        modifier = Modifier.padding(10.dp),
                        style = TextStyle(color = Color.White)
                    )
                })
        }
        Text(
            text = "NOTE: For previous leave form extension go to Modify Leaves page\n",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp),
            maxLines = 1,
            color = Color.Black
        )
    }
}

