package com.example.examplearchitecture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.main.MainFeature
import com.example.navigation.Navigation
import com.github.terrakok.cicerone.androidx.AppNavigator
import org.koin.android.ext.android.inject

class AppActivity: AppCompatActivity() {

    private val mainFeatureApi: MainFeature by inject()
    private val navigation: Navigation by inject()
    private val navigator = AppNavigator(this, R.id.fragmentContainerView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity)

        navigation.holder.setNavigator(navigator)
        addInitFragment()
    }

    private fun addInitFragment() {
        /**
         * логика определения стартового флоу, проверка авторизации, платёжек и прочего
         */
        navigation.router.newRootScreen(mainFeatureApi.getMainFragment())
    }

    override fun onDestroy() {
        navigation.holder.removeNavigator()
        super.onDestroy()
    }
}