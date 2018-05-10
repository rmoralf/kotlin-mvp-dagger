package com.rodrigomoral.kotlinmvp.main

import android.os.Bundle
import com.rodrigomoral.kotlinmvp.R
import com.rodrigomoral.kotlinmvp.core.base.BaseActivity
import com.rodrigomoral.kotlinmvp.core.utils.app
import com.rodrigomoral.kotlinmvp.fragment.FragmentFragment
import com.rodrigomoral.kotlinmvp.main.dagger.MainModule
import javax.inject.Inject

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainActivity : BaseActivity(), MainContract.View {
    //region Dagger
    private val component by lazy { app.component.plus(MainModule(this)) }

    @Inject
    lateinit var mPresenter: MainContract.Presenter
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        //Test call to the presenter
        mPresenter.testFunPresenter()

        loadNewFragment(FragmentFragment(), R.id.main_fragment_container, false)
    }

    //region Contract methods
    override fun testFunView(number: Int) {
        println("Function testFunView $number")
    }
    //endregion

    //region Base methods
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
    //endregion

}
