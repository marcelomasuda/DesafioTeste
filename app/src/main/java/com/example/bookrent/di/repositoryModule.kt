package com.example.bookrent.di

import com.example.bookrent.data.repository.*
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val repositoryModule: Module = module {
    //Add all repositories in project
    single { LoginRepositoryImpl(get()) as LoginRepository }
    single { MoviesRepositoryImpl(get()) as MoviesRepository }
    single { FavoriteRepositoryImpl(get()) as FavoriteRepository }
}