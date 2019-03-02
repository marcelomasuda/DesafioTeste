package com.example.bookrent.screens.sign.signup

import com.example.bookrent.base.presenter.BasePresenter
import com.example.bookrent.data.model.User
import com.example.bookrent.data.repository.LoginRepository
import com.example.bookrent.util.SchedulerProvider.ISchedulerProvider
import io.reactivex.Observable

class SignUpPresenter(
    private val scheduler: ISchedulerProvider,
    private val repository: LoginRepository): BasePresenter<SignUpView>() {

    fun createUser(user: User) {
        val disposable = Observable.just(repository)
            .subscribeOn(scheduler.io())
            .subscribe {
                val response = it.createUser(user)
                if (response > 0) {
                    getView().onComplete()
                } else {
                    getView().onError()
                }
            }
        disposableBag?.add(disposable)
    }


}