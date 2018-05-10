package com.rodrigomoral.kotlinmvp.main

import android.os.Bundle
import android.widget.TextView
import com.rodrigomoral.kotlinmvp.R
import com.rodrigomoral.kotlinmvp.core.base.BaseActivity
import com.rodrigomoral.kotlinmvp.core.utils.app
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

    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        mPresenter.testFunPresenter()
    }

    //region Contract methods
    override fun testFunView(number: Int) {
        println("Function testFunView $number")
    }
    //endregion

    //region Base methods
    override fun bindViews() {
        mTextView = findViewById(R.id.textview)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
    //endregion

}
