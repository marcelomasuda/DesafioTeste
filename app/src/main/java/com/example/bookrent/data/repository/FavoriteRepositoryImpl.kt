package com.example.bookrent.data.repository

import com.example.bookrent.data.database.MovieRoom
import com.example.bookrent.data.model.Favorites
import io.reactivex.Observable

class FavoriteRepositoryImpl(private val db: MovieRoom): FavoriteRepository {

    override fun insertFavorite(movie: Favorites) {
        return db.addFavorite(movie)
    }

    override fun getFavorites(): Observable<List<Favorites>> {
        return db.getFavorites().toObservable()
    }

    override fun removeFavorite(movie: Favorites) {
        return db.removeFavorite(movie)
    }
}