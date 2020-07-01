package com.example.myapplication.di.component

import android.app.Application
import com.example.myapplication.MyApplication
import com.example.myapplication.di.module.ActivityBuilderModule
import com.example.myapplication.di.module.MyViewModelModule
import com.example.myapplication.di.module.NetWorkModule
import com.example.myapplication.di.module.ViewModelProviderModule
import dagger.Component
import dagger.android.AndroidInjectionModule


@Component(
    modules = arrayOf(
        AndroidInjectionModule::class,
        NetWorkModule::class,
        ActivityBuilderModule::class,
        ViewModelProviderModule::class,
        MyViewModelModule::class
    )
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        fun build(): ApplicationComponent

    }

    fun inject(app: MyApplication)

}