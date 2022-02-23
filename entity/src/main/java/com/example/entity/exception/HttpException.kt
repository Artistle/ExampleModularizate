package com.example.entity.exception

import java.lang.Exception

/**
 * в этом пакете стоит описать эксепшены которые могут возникнуть и потом сверять их в BaseFragment
 */
sealed class HttpException : Exception() {

    object BadRequest: HttpException()

    object Unauthorized : HttpException()

    object ServerError : HttpException()

    object Undefined : HttpException()
}
