package com.example.bookrent

import android.support.multidex.MultiDexApplication
import com.example.bookrent.di.appModule
import com.example.bookrent.di.dbModule
import com.example.bookrent.di.presenterModule
import com.example.bookrent.di.repositoryModule
import org.koin.android.ext.android.startKoin
import org.koin.standalone.StandAloneContext.startKoin

class BaseApp: MultiDexApplication() {


    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule, dbModule, presenterModule, repositoryModule))
    }
}