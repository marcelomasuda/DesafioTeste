package com.example.bookrent.data.memory

import com.example.bookrent.data.model.Favorites

interface MemoryCache {

    fun addFavorite(favorite: Favorites)
    fun getFavorites(): List<Favorites>
    fun removeFavorite(favorite: Favorites)
    fun searchFavorite(title: String): Favorites?

}