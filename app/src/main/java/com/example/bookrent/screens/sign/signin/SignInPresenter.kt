package com.example.bookrent.screens.sign.signin

import com.example.bookrent.base.presenter.BasePresenter
import com.example.bookrent.data.repository.LoginRepository
import com.example.bookrent.util.SchedulerProvider.ISchedulerProvider

class SignInPresenter(
    private val schedulerProvider: ISchedulerProvider,
    private val repository: LoginRepository
) : BasePresenter<SignInView>() {

    fun doLogin(username: String, password: String) {
        getView().toggleLoad(true)
        val disposable = repository.doLogin(username, password)
            .observeOn(schedulerProvider.ui())
            .subscribeOn(schedulerProvider.io())
            .subscribe ({
                getView().toggleLoad(false)
                getView().onLogin()
            },{
                getView().toggleLoad(false)
                getView().onError()
            })
        disposableBag?.add(disposable)
    }

}