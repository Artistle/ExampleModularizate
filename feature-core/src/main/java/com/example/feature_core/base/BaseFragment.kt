package com.example.feature_core.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_core.ui.error.ErrorHandler
import com.example.feature_core.ui.error.ErrorHandlerImpl
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.Screen
import org.koin.android.ext.android.inject

open class BaseFragment(@LayoutRes layoutRes: Int) :
    Fragment(layoutRes) {

    private val viewModel: BaseViewModel by viewModels()
    private val errorHandler: ErrorHandler by lazy { ErrorHandlerImpl() }
    private val router: Router by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        errorHandler.bind(view)
        viewModel.errorLiveData.observe(viewLifecycleOwner) { throwable ->
            /**
             *
             * проверка ошибки и открытие соответствующего окна в errorHandler
             *
             * when(throwable) {
             *   is HttpException.BadRequest -> errorHandler.handleHttpError(R)
             *   }
             */
        }
    }

    /**
     * переход на следующий экран
     */
    open fun openFragment(screen: Screen) = router.navigateTo(screen)

    /**
     * замена текущего экрана, не переход! в стэк не будет добавлен
     */
    open fun replaceFragment(screen: Screen) = router.replaceScreen(screen)

    /**
     * сброс всего стека и открытие нового фрагмента, начало нового флоу
     */
    open fun openRootFragment(screen: Screen) = router.newRootScreen(screen)

    override fun onDestroy() {
        errorHandler.unBind()
        super.onDestroy()
    }
}