package com.rodrigomoral.kotlinmvp.fragment

import com.rodrigomoral.kotlinmvp.core.base.BaseContract

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class FragmentContract : BaseContract() {

    interface View : BaseContractView {
        fun testFragmentView(text: String)
    }

    interface Presenter : BaseContractPresenter {
        fun testFragmentPresenter()
    }
}