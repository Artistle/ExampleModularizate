package com.example.navigation_impl

import com.example.navigation.Navigation
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router

class NavigationImpl: Navigation {

    override val cicerone: Cicerone<Router> = Cicerone.create()

    override val holder: NavigatorHolder
        get() = super.holder

    override val router: Router
        get() = super.router
}