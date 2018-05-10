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

    /**
     * Bind all the views if necessary
     */
    protected abstract fun bindViews()

    /**
     * Return this activity layout
     */
    protected abstract fun getLayoutId(): Int
}