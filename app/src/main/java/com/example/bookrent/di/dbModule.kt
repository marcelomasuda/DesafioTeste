package com.example.bookrent.di

import android.arch.persistence.room.Room
import com.example.bookrent.data.database.AppRoom
import com.example.bookrent.data.database.LoginRoom
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val dbModule: Module = module {
    val dbname = "book-rent-db"

    single {  Room.databaseBuilder(androidApplication(), AppRoom::class.java, dbname).build() }

    // Add all rooms in project

    single { get<AppRoom>().loginRoom() }
}