package com.example.bookrent.base.view

interface BaseView {

    fun attachView()
    fun detachView()
    fun getLayoutId(): Int
    fun onViewReady()
    fun onInit()

}