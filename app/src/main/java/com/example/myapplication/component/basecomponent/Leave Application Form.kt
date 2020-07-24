package com.example.myapplication.component.basecomponent

import android.util.Log
import androidx.compose.*
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
import com.example.myapplication.model.LeaveInfo
import com.example.myapplication.ui.Screen
import com.example.myapplication.ui.navigateTo
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

var leaveType: String = ""
var fromDate: String = ""
var toDate: String = ""
var isHalfLeave: Boolean = false
var purpose: String = ""
var address: String = ""
var email: String = ""
var contact: String = ""

@Composable
fun LeaveApplication( db: FirebaseFirestore ) {

    VerticalScroller {

        Surface(color = Color.White) {
            Column {
                BackButton()
                LeaveDetails()
                Divider(thickness = 5.dp)
                LeaveRequestForm()
                LeaveDates()
                Divider(thickness = 5.dp, modifier = Modifier.padding(top = 8.dp))
                ContactDetails(db)
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
                leaveType = textValue.text
                println("Leave Type = $leaveType")
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
                isHalfLeave = checked
            })
        println("Half Leave = $isHalfLeave")
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
            fromDate = textValue.text
            println("From Date = $fromDate" )
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
            toDate = textValue.text
            println("To Date = $toDate" )
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
            purpose = textValue.text
            println("Purpose = $purpose" )
        }
    }
}

@Composable
fun ContactDetails(db : FirebaseFirestore) {
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
                address = textValue.text
                println("Address = $address" )
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
                email = textValue.text
                println("Email = $email" )
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
                contact = textValue.text
                println("Contact No = $contact" )
            }
        }
        Divider(thickness = 5.dp, modifier = Modifier.padding(top = 8.dp, bottom = 5.dp))

        Row {
            Button(onClick = {
                var leaveInfo = LeaveInfo(
                    leaveType = leaveType,
                    fromDate = fromDate,
                    toDate = toDate,
                    isHalfLeave = isHalfLeave,
                    purpose = purpose,
                    address = address,
                    email = email,
                    contact = contact,
                    status = 1
                )
                addLeaveRequest(db, leaveInfo)
            },
                modifier = Modifier.padding(start = 16.dp, top = 10.dp),
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
                        "Cancel",
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

private fun addLeaveRequest(db : FirebaseFirestore, leaveInfo: LeaveInfo) {
    //add new leave request
    val leaveInformation = hashMapOf(
        "leaveType" to leaveInfo.leaveType,
        "fromDate" to leaveInfo.fromDate,
        "toDate" to leaveInfo.toDate,
        "isHalfDayLeave" to leaveInfo.isHalfLeave,
        "purpose" to leaveInfo.purpose,
        "address" to leaveInfo.address,
        "email" to leaveInfo.email,
        "contact" to leaveInfo.contact,
        "status" to leaveInfo.status
    )
    // Add a new document with a generated ID
    db.collection("leaverequests")
        .add(leaveInformation)
        .addOnSuccessListener { documentReference ->
            Log.d("Leave application form", "DocumentSnapshot added with ID: ${documentReference.id}")
        }
        .addOnFailureListener { e ->
            Log.w("Leave application form", "Error adding document", e)
        }

}


