package com.example.bookrent.screens.sign.signup

import android.os.Bundle
import com.example.bookrent.R
import com.example.bookrent.base.view.BaseFragment
import com.jakewharton.rxbinding2.view.clicks
import kotlinx.android.synthetic.main.sign_up_view.*
import org.koin.android.viewmodel.ext.android.viewModel

class SignUpFragment: BaseFragment(), SignUpView {

    companion object {
        fun newInstance(): SignUpFragment {
            val args = Bundle()
            val fragment = SignUpFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private val mPresenter: SignUpPresenter by viewModel()

    override fun attachView() {
        mPresenter.onAttach(this)
    }

    override fun detachView() {
    mPresenter.onDetach()
    }

    override fun getLayoutId(): Int = R.layout.sign_up_view

    override fun onViewReady() {
        disposableBag.add(
            sign_up_cancel_btn.clicks().subscribe {
                activity?.supportFragmentManager?.popBackStack()
            }
        )
    }
}