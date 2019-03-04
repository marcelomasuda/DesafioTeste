package com.example.bookrent.screens.main

import com.example.bookrent.R
import com.example.bookrent.base.view.BaseActivity
import com.example.bookrent.base.view.BaseView
import com.example.bookrent.screens.main.movieList.MovieListFragment
import kotlinx.android.synthetic.main.main_view.*

class MainActivity: BaseActivity(), BaseView {

    override fun attachView() {}

    override fun detachView() {}

    override fun getLayoutId(): Int = R.layout.main_view

    override fun onViewReady() {
        replaceFragment(MovieListFragment.newInstance(), view_container)
    }
}