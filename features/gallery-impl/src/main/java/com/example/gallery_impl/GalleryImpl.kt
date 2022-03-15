package com.example.gallery_impl

import com.example.gallery.Gallery
import com.example.gallery_impl.view.GalleryFragment
import com.github.terrakok.cicerone.Screen

class GalleryImpl: Gallery {

    override fun getGalleryFragment(): Screen = GalleryFragment.createFragment()
}