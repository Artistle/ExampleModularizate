package com.example.services

interface ServiceFactory {

    fun <S> createService(apiClass: Class<S>): S
}