package com.rodrigomoral.kotlinmvp.core.application.dagger

import com.rodrigomoral.kotlinmvp.core.application.App
import com.rodrigomoral.kotlinmvp.main.dagger.MainComponent
import com.rodrigomoral.kotlinmvp.main.dagger.MainModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: App)

    fun plus(mainModule: MainModule): MainComponent

}