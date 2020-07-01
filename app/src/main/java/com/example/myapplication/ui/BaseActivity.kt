package com.example.myapplication.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme

abstract class BaseActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            MaterialTheme() {
                component()
            }
        }
    }

    @Composable
    abstract fun component()

    @Composable
    abstract fun preview()


}