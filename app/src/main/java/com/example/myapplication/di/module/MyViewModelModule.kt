package com.example.myapplication.di.module

import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.landing.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * and finally an example of Module who provides a ViewModel
 */
@Module
abstract class MyViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class) // Here we are assigning the key to view model
    abstract fun bindMyViewModel(myViewModel: MainViewModel): ViewModel

}