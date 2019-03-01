package com.example.bookrent.base.presenter

import com.example.bookrent.base.view.BaseView

interface Presenter<V> where V : BaseView {
    fun getView(): V

    fun onAttach(view: V)
    fun onDetach()

}