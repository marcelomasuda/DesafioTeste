package com.example.bookrent.screens.splash

import android.content.Intent
import com.example.bookrent.R
import com.example.bookrent.base.view.BaseActivity
import com.example.bookrent.screens.sign.SignActivity
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity(), SplashView {

    private val mPresenter: SplashPresenter by viewModel()

    override fun attachView() {
        mPresenter.onAttach(this)
    }

    override fun detachView() {
        mPresenter.onDetach()
    }

    override fun getLayoutId(): Int = R.layout.splash_view

    override fun onViewReady() {
        val intent = Intent(this, SignActivity::class.java)
        startActivity(intent)
        finish()
    }

}
