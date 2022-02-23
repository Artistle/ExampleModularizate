package com.example.main_impl

import com.example.main.MainFeature
import com.example.main_impl.view.MainFragment

class MainFeatureImpl : MainFeature {

    override fun getMainFragment() = MainFragment.createFragment()
}