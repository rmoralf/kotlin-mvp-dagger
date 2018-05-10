package com.rodrigomoral.kotlinmvp.main

import com.rodrigomoral.kotlinmvp.core.base.BasePresenter

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainPresenter(private val mView: MainContract.View) : BasePresenter(mView), MainContract.Presenter {

    //region Contract methods
    override fun testFunPresenter() {
        println("Function testFunPresenter")
        mView.testFunView(2)
    }
    //endregion
}