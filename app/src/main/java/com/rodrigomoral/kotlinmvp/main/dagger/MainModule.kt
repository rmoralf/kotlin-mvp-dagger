package com.rodrigomoral.kotlinmvp.main.dagger

import com.rodrigomoral.kotlinmvp.core.application.dagger.BaseScope
import com.rodrigomoral.kotlinmvp.main.MainContract
import com.rodrigomoral.kotlinmvp.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

@Module
class MainModule(private val mView: MainContract.View) {

    @Provides
    @BaseScope
    fun providesMainPresenter(view: MainContract.View): MainContract.Presenter = MainPresenter(view)

    @Provides
    @BaseScope
    fun providesMainView(): MainContract.View = mView

}