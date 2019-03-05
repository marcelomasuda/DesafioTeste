package com.example.bookrent.screens.main.favoriteList

import android.util.Log
import com.example.bookrent.base.presenter.BasePresenter
import com.example.bookrent.data.model.Favorites
import com.example.bookrent.data.repository.FavoriteRepository
import com.example.bookrent.util.SchedulerProvider.ISchedulerProvider
import io.reactivex.Observable

class FavoriteListPresenter(
    private val scheduler: ISchedulerProvider,
    private val repository: FavoriteRepository
): BasePresenter<FavoriteListView>() {

    fun getFavoriteList() {
        val disposable = repository.getFavorites()
            .observeOn(scheduler.ui())
            .subscribeOn(scheduler.io())
            .subscribe {
                Log.i("FAVORITO", "$it")
                getView().refreshList(it)
            }
        disposableBag?.add(disposable)
    }

    fun removeFavorite(favorite: Favorites) {
        val disposable = Observable.just(repository)
            .subscribeOn(scheduler.io())
            .subscribe {
                it.removeFavorite(favorite)
            }
        disposableBag?.add(disposable)
    }

}