package com.example.bookrent.data.repository

import com.example.bookrent.data.model.Movies
import io.reactivex.Observable

interface MoviesRepository {

    fun getMoviesList(page: Int): Observable<List<Movies>>
}