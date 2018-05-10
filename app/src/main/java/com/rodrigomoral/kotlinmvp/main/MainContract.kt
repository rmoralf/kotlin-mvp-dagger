package com.rodrigomoral.kotlinmvp.main

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainContract {

    interface View {
        fun testFunView(number: Int)
    }

    interface Presenter {
        fun testFunPresenter()
    }
}