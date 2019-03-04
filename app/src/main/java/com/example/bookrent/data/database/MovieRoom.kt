package com.example.bookrent.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.bookrent.data.model.Favorites
import io.reactivex.Single

@Dao
interface MovieRoom {

    @Insert
    fun addFavorite(movie: Favorites)

    @Query("SELECT * FROM favorites")
    fun getFavorites(): Single<List<Favorites>>

    @Delete
    fun removeFavorite(movie: Favorites)

}