package com.rodrigomoral.kotlinmvp.fragment

import android.os.Bundle
import android.view.View
import com.rodrigomoral.kotlinmvp.R
import com.rodrigomoral.kotlinmvp.core.base.BaseFragment
import com.rodrigomoral.kotlinmvp.core.utils.app
import com.rodrigomoral.kotlinmvp.fragment.dagger.FragmentModule
import javax.inject.Inject

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class FragmentFragment : BaseFragment(), FragmentContract.View {

    //region Dagger
    private val component by lazy { activity?.app?.component?.plus(FragmentModule(this)) }

    @Inject
    lateinit var mPresenter: FragmentContract.Presenter
    //endregion

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        component?.inject(this)

        //Test call to presenter
        mPresenter.testFragmentPresenter()
    }
    //endregion

    //region Contract methods
    override fun testFragmentView(text: String) {
        println("Function testFragmentView $text")
    }
    //endregion

    //region Base methods
    override fun getLayoutId(): Int {
        return R.layout.fragment
    }
    //endregion
}