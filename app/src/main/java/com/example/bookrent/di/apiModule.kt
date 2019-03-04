package com.example.bookrent.di

import com.example.bookrent.data.api.MoviesAPI
import org.koin.dsl.module.Module
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


fun createRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://api.trakt.tv/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
}

val apiModule: Module = module {

    single { createRetrofit() }

    single { get<Retrofit>().create(MoviesAPI::class.java) }
}