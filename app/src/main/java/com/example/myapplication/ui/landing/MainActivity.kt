package com.example.myapplication.ui.landing

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.ui.animation.Crossfade
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Spacer

import androidx.ui.layout.padding
import androidx.ui.material.ListItem
import androidx.ui.material.MaterialTheme
import androidx.ui.unit.dp
import com.example.myapplication.NavigationSealed
import com.example.myapplication.SecondActivity

import com.example.myapplication.base.ViewModelFactory

import com.example.myapplication.component.basecomponent.LeaveApplication
import com.example.myapplication.component.basecomponent.LeaveManagement
import com.example.myapplication.component.basecomponent.LeaveStatus
import com.example.myapplication.component.basecomponent.LoginField
import com.example.myapplication.component.response.MainServerResponse
import com.example.myapplication.data.response.ItemViewType
import com.example.myapplication.data.response.Items
import com.example.myapplication.data.response.ServerUi
import com.example.myapplication.data.response.SubItemViewType
import com.example.myapplication.domain.GetAllLayutRepositoty
import com.example.myapplication.sealed.MainActivityViewState
import com.example.myapplication.ui.JetExposeStatus
import com.example.myapplication.ui.Screen
import dagger.android.AndroidInjection
import kotlinx.coroutines.delay
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repositoty: GetAllLayutRepositoty

    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    var serverUi: MainServerResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)


        setContent {
            MaterialTheme {
                Crossfade(JetExposeStatus.currentScreen) { screen ->
                    when (screen) {
                        is Screen.LoginScreen -> LoginField()
                        is Screen.LeaveManagementScreen -> LeaveManagement()
                        is Screen.LeaveApplicationScreen -> LeaveApplication()
                        is Screen.AppliedLeaveStatusScreen -> LeaveStatus()

                    }
                }
            }
               /* viewModel.getLayout()

                viewModel.successResponse.observe(this, Observer {
                    when (it) {
                        is MainActivityViewState.ShowLoading -> { // SHow Loading
                        }
                        is MainActivityViewState.ShowData<*> -> {
                            serverUi = it.data as MainServerResponse
                            Log.e("Data", "${serverUi?.listData}")
                            var intent = Intent(this, ThirdActivity::class.java)
                            intent.putExtra("data", serverUi)
                            startActivity(intent)

                        }
                        is MainActivityViewState.ShowError -> {// show SError
                        }
                    }

                })*/

            }
        }
    }





@Composable
fun SampleListView(onSampleClicked: (NavigationSealed) -> Unit = {}) {
    val samples = listOf(
        NavigationSealed(
            name = "Crossfade",
            clazz = SecondActivity::class
        )
    ).sortedBy { it.name }

    Column {
        Text("Lista de Exemplos", modifier = Modifier.padding(16.dp))
        AdapterList(data = samples) { sample ->
            ListItem(onClick = {
                onSampleClicked(sample)
            }) {
                Text(text = sample.name)


            }
        }
    }
}


