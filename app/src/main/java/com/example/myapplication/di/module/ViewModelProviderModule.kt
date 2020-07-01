package com.example.myapplication.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.base.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelProviderModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}

