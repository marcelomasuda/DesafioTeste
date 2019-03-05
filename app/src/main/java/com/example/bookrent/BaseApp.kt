package com.example.bookrent

import androidx.multidex.MultiDexApplication
import com.example.bookrent.di.*
import org.koin.android.ext.android.startKoin

class BaseApp: MultiDexApplication() {


    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule, dbModule, presenterModule, repositoryModule, apiModule))
    }
}