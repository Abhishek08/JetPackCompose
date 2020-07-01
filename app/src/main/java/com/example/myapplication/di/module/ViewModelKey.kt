package com.example.myapplication.di.module

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass


/**
 * Now to bind ViewModel and create these Map we need the multibindings
 * and to do it we will use a specific annotation, we will call it ViewModelKey,
 * it’s represents the key of our map.
 */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)