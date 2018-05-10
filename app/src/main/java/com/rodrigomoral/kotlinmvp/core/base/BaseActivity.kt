package com.rodrigomoral.kotlinmvp.core.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        bindViews()
    }

    protected abstract fun bindViews()
    protected abstract fun getLayoutId(): Int
}