package com.rodrigomoral.kotlinmvp.core.utils

import android.app.Activity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.rodrigomoral.kotlinmvp.core.application.App

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

/**
 * Simplifies access to (casted) application
 */
val Activity.app: App
    get() = application as App

/**
 * Simplifies all the fragment transactions
 */
inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}