package com.rodrigomoral.kotlinmvp.main

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainPresenter(private val mView: MainContract.View) : MainContract.Presenter {
    override fun testFunPresenter() {
        println("Function testFunPresenter")
        mView.testFunView(2)
    }
}