package com.example.bookrent.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.bookrent.data.model.Favorites
import com.example.bookrent.data.model.User

@Database(entities = [
    (User::class),
    (Favorites::class)
], version = 1, exportSchema = false)
abstract class AppRoom : RoomDatabase() {

    abstract fun loginRoom(): LoginRoom
    abstract fun movieRoom(): MovieRoom

}