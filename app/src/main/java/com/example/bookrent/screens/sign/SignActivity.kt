package com.example.bookrent.screens.sign

import com.example.bookrent.R
import com.example.bookrent.base.view.BaseActivity
import com.example.bookrent.screens.sign.signin.SignInFragment
import com.example.bookrent.screens.sign.signup.SignUpFragment
import kotlinx.android.synthetic.main.sign_view.*
import org.koin.android.viewmodel.ext.android.viewModel

class SignActivity: BaseActivity(), SignView {

    private val mPresenter: SignPresenter by viewModel()

    override fun attachView() {
        mPresenter.onAttach(this)
    }

    override fun detachView() {
        mPresenter.onDetach()
    }

    override fun getLayoutId(): Int = R.layout.sign_view

    override fun onViewReady() {
    }

    override fun onInit() {
        openSignIn()
    }

    override fun openSignIn() {
        replaceFragment(SignInFragment.newInstance(), sign_container)
    }

    override fun openSignUp() {
        replaceFragment(SignUpFragment.newInstance(), sign_container)
    }
}