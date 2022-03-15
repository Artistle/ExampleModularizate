package com.example.gallery_impl.view

import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class GalleryFragment: Fragment() {

    companion object {

        fun createFragment() = FragmentScreen { GalleryFragment() }
    }
}