package com.example.bookrent.data.repository

import com.example.bookrent.data.api.MoviesAPI
import com.example.bookrent.data.model.Movies
import io.reactivex.Observable

class MoviesRepositoryImpl(private val api: MoviesAPI): MoviesRepository {

    override fun getMoviesList(page: Int): Observable<List<Movies>> {
        return api.getMoviesList(page)
    }
}