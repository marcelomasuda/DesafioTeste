package com.example.bookrent.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.example.bookrent.data.model.User

@Database(entities = [
    (User::class)
], version = 1, exportSchema = false)
abstract class AppRoom : RoomDatabase() {

    abstract fun loginRoom(): LoginRoom
}