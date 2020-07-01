package com.example.myapplication.sealed

sealed class MainActivityViewState {
    object ShowLoading : MainActivityViewState()
    class ShowError(val error: Throwable) : MainActivityViewState()
    class ShowData<out T : Any>(val data: T) : MainActivityViewState()
}