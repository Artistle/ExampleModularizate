package com.example.main_impl.view

import android.os.Bundle
import android.view.View
import com.example.feature_core.base.BaseFragment
import com.example.main_impl.R
import com.github.terrakok.cicerone.androidx.FragmentScreen

class MainFragment : BaseFragment(R.layout.main_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun createFragment() = FragmentScreen { MainFragment() }
    }
}