package com.example.bookrent.screens.main

import com.example.bookrent.R
import com.example.bookrent.base.view.BaseActivity
import com.example.bookrent.base.view.BaseView
import com.example.bookrent.screens.main.favoriteList.FavoriteListFragment
import com.example.bookrent.screens.main.movieList.MovieListFragment
import kotlinx.android.synthetic.main.main_view.*


class MainActivity : BaseActivity(), BaseView {

    override fun attachView() {}

    override fun detachView() {}

    override fun getLayoutId(): Int = R.layout.main_view

    override fun onViewReady() {
        replaceFragment(MovieListFragment.newInstance(), view_container)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_list -> {
                    replaceFragment(MovieListFragment.newInstance(), view_container)
                }
                R.id.nav_favorites -> {
                    replaceFragment(FavoriteListFragment.newInstance(), view_container)
                }
                else -> {
                    replaceFragment(MovieListFragment.newInstance(), view_container)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }


}