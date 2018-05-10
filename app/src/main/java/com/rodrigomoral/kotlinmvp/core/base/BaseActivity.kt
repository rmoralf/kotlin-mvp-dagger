package com.rodrigomoral.kotlinmvp.core.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rodrigomoral.kotlinmvp.core.utils.inTransaction

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    fun loadNewFragment(fragment: BaseFragment, containerView: Int, addToBackStack: Boolean) {
        if (addToBackStack)
            supportFragmentManager.inTransaction {
                replace(containerView, fragment, fragment.javaClass.simpleName)
            }
        else
            supportFragmentManager.inTransaction {
                replace(containerView, fragment, fragment.javaClass.simpleName)
                        .addToBackStack(fragment.javaClass.simpleName)
            }
    }

    /**
     * Return this activity layout
     */
    protected abstract fun getLayoutId(): Int
}