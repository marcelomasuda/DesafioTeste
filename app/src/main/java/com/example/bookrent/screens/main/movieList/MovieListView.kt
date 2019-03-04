package com.example.bookrent.screens.main.movieList

import com.example.bookrent.base.view.BaseView
import com.example.bookrent.data.model.Movies

interface MovieListView: BaseView {

    fun refreshList(list: List<Movies>)
}