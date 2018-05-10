package com.rodrigomoral.kotlinmvp.main.dagger

import com.rodrigomoral.kotlinmvp.core.application.dagger.BaseScope
import com.rodrigomoral.kotlinmvp.main.MainActivity
import dagger.Subcomponent

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

@BaseScope
@Subcomponent(modules = [MainModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}