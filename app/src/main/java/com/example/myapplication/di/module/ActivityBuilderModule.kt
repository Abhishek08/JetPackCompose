package com.example.myapplication.di.module

import com.example.myapplication.ui.landing.MainActivity
import com.example.myapplication.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun seconActivity(): SecondActivity
}