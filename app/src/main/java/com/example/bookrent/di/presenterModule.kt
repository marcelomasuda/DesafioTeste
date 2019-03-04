package com.example.bookrent.di

import com.example.bookrent.screens.main.favoriteList.FavoritePresenter
import com.example.bookrent.screens.main.movieList.MovieListPresenter
import com.example.bookrent.screens.sign.SignPresenter
import com.example.bookrent.screens.sign.signin.SignInPresenter
import com.example.bookrent.screens.sign.signup.SignUpPresenter
import com.example.bookrent.screens.splash.SplashPresenter
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val presenterModule: Module = module {

    //Splash
    viewModel { SplashPresenter() }

    //Sign
    viewModel { SignPresenter() }
    viewModel { SignInPresenter(get(), get()) }
    viewModel { SignUpPresenter(get(), get()) }
    viewModel { MovieListPresenter(get(), get(), get()) }
    viewModel { FavoritePresenter(get(), get())}


}