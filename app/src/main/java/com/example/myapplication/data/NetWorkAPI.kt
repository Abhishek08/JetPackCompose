package com.example.myapplication.data

import com.example.myapplication.component.response.MainServerResponse
import com.example.myapplication.data.response.ServerUi
import retrofit2.http.GET

interface NetWorkAPI {
    @GET("layout.json")
    suspend fun getDashboard(): ServerUi

    @GET("dynamic.json")
    suspend fun getNewServerData(): MainServerResponse
}