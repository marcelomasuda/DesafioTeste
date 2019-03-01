package com.example.bookrent.data.repository

import com.example.bookrent.data.model.User
import io.reactivex.Observable

interface LoginRepository {
    fun doLogin(email: String, password: String): Observable<User>
}