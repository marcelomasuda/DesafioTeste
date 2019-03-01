package com.example.bookrent.base.view

import android.content.Context

interface BaseView {

    fun attachView()
    fun detachView()
    fun getLayoutId(): Int
    fun onViewReady()
    fun onInit()

}