package com.rodrigomoral.kotlinmvp.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rodrigomoral.kotlinmvp.R
import com.rodrigomoral.kotlinmvp.core.utils.app
import com.rodrigomoral.kotlinmvp.main.dagger.MainModule
import javax.inject.Inject

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class MainActivity : AppCompatActivity(), MainContract.View {

    //region Dagger
    private val component by lazy { app.component.plus(MainModule(this)) }

    @Inject
    lateinit var mPresenter: MainContract.Presenter
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        mPresenter.testFunPresenter()
    }

    override fun testFunView(number: Int) {
        println("Function testFunView $number")
    }
    //endregion
}
