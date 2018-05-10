package com.rodrigomoral.kotlinmvp.core.application

import android.app.Application
import com.rodrigomoral.kotlinmvp.core.application.dagger.AppComponent
import com.rodrigomoral.kotlinmvp.core.application.dagger.AppModule
import com.rodrigomoral.kotlinmvp.core.application.dagger.DaggerAppComponent

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

class App : Application() {

    val component: AppComponent  by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}