package com.example.services_impl

import com.example.services.ServiceFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceFactoryImpl(
    baseUrl: String
): ServiceFactory {

    override fun <S> createService(apiClass: Class<S>): S {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(apiClass)
    }

}
