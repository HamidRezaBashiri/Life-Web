package com.example.lifeweb.repository.remote

import com.example.lifeweb.repository.remote.Api_Interface.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {
    private fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun apiService(): Api_Interface =
        getRetrofit().create(Api_Interface::class.java)
}