package com.example.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router

/**
 * todo подумать над глобальным объектом навигатора
 */
interface Navigation {

    val cicerone: Cicerone<Router>

    val router: Router
        get() = cicerone.router

    val holder: NavigatorHolder
        get() = cicerone.getNavigatorHolder()
}