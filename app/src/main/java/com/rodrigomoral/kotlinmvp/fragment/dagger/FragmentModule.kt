package com.rodrigomoral.kotlinmvp.fragment.dagger

import com.rodrigomoral.kotlinmvp.core.application.dagger.BaseScope
import com.rodrigomoral.kotlinmvp.fragment.FragmentContract
import com.rodrigomoral.kotlinmvp.fragment.FragmentPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

@Module
class FragmentModule(private val mView: FragmentContract.View) {

    @Provides
    @BaseScope
    fun providesFragmentPresenter(view: FragmentContract.View): FragmentContract.Presenter = FragmentPresenter(view)

    @Provides
    @BaseScope
    fun providesFragmentView(): FragmentContract.View = mView
}