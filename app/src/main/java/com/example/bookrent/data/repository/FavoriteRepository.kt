package com.example.bookrent.data.repository

import com.example.bookrent.data.model.Favorites
import io.reactivex.Observable

interface FavoriteRepository {

    fun insertFavorite(movie: Favorites)
    fun getFavorites(): Observable<List<Favorites>>
    fun removeFavorite(movie: Favorites)
}