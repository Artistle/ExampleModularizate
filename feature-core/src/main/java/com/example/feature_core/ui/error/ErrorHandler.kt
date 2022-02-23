package com.example.feature_core.ui.error

import android.view.View
import androidx.annotation.StringRes

interface ErrorHandler {

    fun bind(view: View)

    fun unBind()

    fun handleNetworkError(@StringRes errorRes: Int)

    fun handleServerError(@StringRes errorRes: Int)

    fun handleHttpError(@StringRes errorRes: Int)

}