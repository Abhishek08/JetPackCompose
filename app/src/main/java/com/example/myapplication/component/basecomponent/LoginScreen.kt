package com.example.myapplication.component.basecomponent

import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.input.ImeAction
import androidx.ui.input.KeyboardType
import androidx.ui.input.PasswordVisualTransformation
import androidx.ui.layout.Column

import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.myapplication.ui.Screen
import com.example.myapplication.ui.navigateTo

@Composable
fun LoginField() {

    VerticalScroller {
        Column {

            SimpleTextInputComponent()
            PasswordVisualTransformationInputComponent()
            LoginSuccess()
        }
    }
}


@Composable
fun SimpleTextInputComponent() {

    Column {

        Text(
            text = "LOGIN",
            modifier = Modifier.padding(top = 30.dp, start = 150.dp),
            style = TextStyle(fontSize = 30.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )

        Text(
            text = "Username",
            modifier = Modifier.padding(top = 30.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
        Surface(color = Color.LightGray, modifier = Modifier.padding(16.dp)) {
            var textValue by state { TextFieldValue(" ") }
            TextField(value = textValue,
                modifier = Modifier.padding(16.dp) + Modifier.fillMaxWidth(),
                // Update value of textValue with the latest value of the text field
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
}

@Composable
fun PasswordVisualTransformationInputComponent() {
    Column {
        Text(
            text = "Password",
            modifier = Modifier.padding(top = 5.dp, start = 16.dp),
            style = TextStyle(fontSize = 20.sp), fontStyle = FontStyle.Normal,
            maxLines = 1,
            color = Color.Black
        )
        Surface(color = Color.LightGray, modifier = Modifier.padding(16.dp)) {
            var textValue by state { TextFieldValue("") }
            TextField(value = textValue,
                modifier = Modifier.padding(16.dp) + Modifier.fillMaxWidth(),
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done,
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = {
                    textValue = it
                }
            )
        }
    }
}

@Composable
fun LoginSuccess() {
    Button(onClick = {
        navigateTo(Screen.LeaveManagementScreen)
    },
        modifier = Modifier.padding(start = 160.dp, top = 30.dp),backgroundColor = Color.Blue,
        text = {
            Text(
                "Login",
                modifier = Modifier.padding(10.dp),
                style = TextStyle(color = Color.White)
            )
        })
}

@Composable
@Preview
fun Greeting() {
    SimpleTextInputComponent()
}