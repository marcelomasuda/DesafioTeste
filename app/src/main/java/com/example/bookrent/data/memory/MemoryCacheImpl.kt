package com.example.bookrent.data.memory

import com.example.bookrent.data.model.Favorites

class MemoryCacheImpl: MemoryCache {

    private val favorites: ArrayList<Favorites> = arrayListOf()

    override fun addFavorite(favorite: Favorites) {
        favorites.add(favorite)
    }

    override fun getFavorites(): List<Favorites> {
        return favorites
    }

    override fun removeFavorite(favorite: Favorites) {
        favorites.remove(favorite)
    }

    override fun searchFavorite(title: String): Favorites? {
        return favorites.find { f -> f.title == title }
    }
}