package com.example.myapplication.domain

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.data.NetWorkAPI
import com.example.myapplication.extension.CoroutinesDispatcherProvider
import com.example.myapplication.extension.ResultHandler
import com.example.myapplication.extension.runIO
import com.example.myapplication.sealed.MainActivityViewState
import javax.inject.Inject

class GetAllLayutRepositoty @Inject constructor(
    val api: NetWorkAPI,
    private val coroutinesDispatcherProvider: CoroutinesDispatcherProvider
) {

    val TAG = GetAllLayutRepositoty::class.java.simpleName
    val _state: MutableLiveData<MainActivityViewState> = MutableLiveData()

    suspend fun getAllLayout() {

        _state.postValue(MainActivityViewState.ShowLoading)
        val response =
            runIO(coroutinesDispatcherProvider) { api.getNewServerData() }

        when (response) {
            is ResultHandler.Error -> {
                val throwable = response.throwable
                Log.i(TAG, throwable.toString())
                _state.postValue(
                    MainActivityViewState.ShowError(
                        throwable
                    )
                )
            }
            is ResultHandler.Success -> {
                val result = response.data
                Log.i(TAG, result.toString())
                _state.postValue(
                    MainActivityViewState.ShowData(
                        result
                    )
                )
            }
        }
    }

}