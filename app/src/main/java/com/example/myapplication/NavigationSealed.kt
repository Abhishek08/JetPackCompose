package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

data class NavigationSealed(
    val name: String,
    val clazz: KClass<out AppCompatActivity>
)
