package com.example.bookrent.screens.main.favoriteList

import com.example.bookrent.base.view.BaseView
import com.example.bookrent.data.model.Favorites

interface FavoriteListView: BaseView {

    fun refreshList(list: List<Favorites>)
}