package com.rodrigomoral.kotlinmvp.fragment

import com.rodrigomoral.kotlinmvp.core.base.BasePresenter

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */
class FragmentPresenter(private val mView: FragmentContract.View) : BasePresenter(mView), FragmentContract.Presenter {

    override fun testFragmentPresenter() {
        println("Function testFragmentPresenter")
        mView.testFragmentView("Test")
    }
    //endregion
}