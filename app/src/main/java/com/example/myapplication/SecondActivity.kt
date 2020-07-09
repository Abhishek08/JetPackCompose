package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.*
import androidx.ui.layout.Column
import androidx.ui.material.*
import com.example.myapplication.component.basecomponent.BottomNavigationSample
import com.example.myapplication.component.basecomponent.titleBox
import com.example.myapplication.component.response.MainServerResponse
import com.example.myapplication.component.showDashboard
import com.example.myapplication.data.response.ServerUi
import com.example.myapplication.uigerate.genrateUiFromServerResponse

class SecondActivity : AppCompatActivity() {

    lateinit var serverUi: MainServerResponse
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDataFromIntent()
        setContent {
            MaterialTheme {
                Column {
                    titleBox()
                    genrateUiFromServerResponse(serverUi.listData)
                }
                BottomNavigationSample()
            }
        }
    }

    fun getDataFromIntent() {
        if (intent.hasExtra("data")) {
            serverUi = intent.getSerializableExtra("data") as MainServerResponse
            Log.e("WOW", "WOW...")
        }
    }
}





