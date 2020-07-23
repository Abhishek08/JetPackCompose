package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.*
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.unit.dp
import com.example.myapplication.component.basecomponent.*
import com.example.myapplication.component.response.MainServerResponse
import com.example.myapplication.component.response.TopLevelItem
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
                NavDrawer(serverUi.listData)
                //genrateUiFromServerResponse(serverUi.listData)
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

    @Composable
    fun NavDrawer(listData: List<TopLevelItem>){
        val (currentState, stateChanged) = state { DrawerState.Closed }
        ModalDrawerLayout(
            drawerState = currentState,
            onStateChange = stateChanged,
            drawerContent = { AppDrawer(closeDrawer = { stateChanged(DrawerState.Closed) }) },
            bodyContent = { TitleBox(listData = listData, openDrawer = { stateChanged(DrawerState.Opened) } ) })
    }
}





