package com.example.bookrent.screens.sign.signin

import com.example.bookrent.base.view.BaseView

interface SignInView: BaseView {
    fun onLogin()
    fun onError()
    fun toggleLoad(show: Boolean)
    fun toggleLoginEnabled(enable: Boolean)
}