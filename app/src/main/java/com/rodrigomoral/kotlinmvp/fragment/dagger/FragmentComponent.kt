package com.rodrigomoral.kotlinmvp.fragment.dagger

import com.rodrigomoral.kotlinmvp.core.application.dagger.BaseScope
import com.rodrigomoral.kotlinmvp.fragment.FragmentFragment
import dagger.Subcomponent

/**
 * Created by Rodrigo Moral Fiel on 10/05/2018
 */

@BaseScope
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: FragmentFragment)
}