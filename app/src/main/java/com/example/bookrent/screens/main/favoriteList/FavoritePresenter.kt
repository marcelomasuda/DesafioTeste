package com.example.bookrent.screens.main.favoriteList

import com.example.bookrent.base.presenter.BasePresenter
import com.example.bookrent.data.repository.FavoriteRepository
import com.example.bookrent.util.SchedulerProvider.ISchedulerProvider

class FavoritePresenter(
    private val scheduler: ISchedulerProvider,
    private val repository: FavoriteRepository
): BasePresenter<FavoriteView>() {

}