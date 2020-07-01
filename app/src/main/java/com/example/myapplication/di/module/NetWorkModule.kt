package com.example.myapplication.di.module

import com.example.myapplication.data.NetWorkAPI
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
class NetWorkModule {
    @Provides
    fun provideOkHttp(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient().newBuilder()
            .readTimeout(1200, TimeUnit.SECONDS)
            .connectTimeout(1200, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .build()

    @Provides
    fun provideGson(): GsonConverterFactory = GsonConverterFactory.create()


    @Provides
    fun provideHttpLoger(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    fun provideRetrofit(
        gsonConverterFactory: GsonConverterFactory,
        okHttpClient: OkHttpClient
    ): NetWorkAPI =
        Retrofit.Builder().baseUrl("https://gist.githubusercontent.com/Abhishek08/eddadbdc58de9b5742ee023802b6c1c5/raw/")
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient).build().create(NetWorkAPI::class.java)
}