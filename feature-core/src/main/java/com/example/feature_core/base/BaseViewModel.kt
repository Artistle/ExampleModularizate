package com.example.feature_core.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.feature_core.livedata.SingleLiveEvent
import kotlinx.coroutines.*
import timber.log.Timber
import kotlin.coroutines.CoroutineContext

open class BaseViewModel: ViewModel(), CoroutineScope {

    private val job = SupervisorJob()

    private val errorHandler = CoroutineExceptionHandler { _, throwable ->
        handleError(throwable)
    }

    override val coroutineContext: CoroutineContext = job + Dispatchers.IO + errorHandler

    private val _errorLiveData = SingleLiveEvent<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private fun handleError(throwable: Throwable) {
        Timber.e(throwable)
        /**
         *  _errorLiveData.postValue(thorwable)
         */
    }

    override fun onCleared() {
        coroutineContext.cancelChildren()
        super.onCleared()
    }
}