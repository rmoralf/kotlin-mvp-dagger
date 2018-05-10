package com.rodrigomoral.kotlinmvp.main

import com.rodrigomoral.kotlinmvp.core.base.BaseContract

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainContract : BaseContract() {

    interface View : BaseContractView {
        fun testFunView(number: Int)
    }

    interface Presenter : BaseContractPresenter {
        fun testFunPresenter()
    }
}