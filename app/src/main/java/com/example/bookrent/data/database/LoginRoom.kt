package com.example.bookrent.data.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.bookrent.data.model.User
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface LoginRoom {

    @Query("SELECT * FROM user WHERE email=:email & password=:password")
    fun doLogin(email: String, password: String): Single<User>
}