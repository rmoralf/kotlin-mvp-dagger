package com.rodrigomoral.kotlinmvp.core.utils

import android.app.Activity
import com.rodrigomoral.kotlinmvp.core.application.App

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

/**
 * Simplify access to (casted) application
 */
val Activity.app: App
    get() = application as App