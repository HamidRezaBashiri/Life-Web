package com.example.lifeweb.repository

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitBuilder {

    val BASE_URLl = "https://ngo.cheshmechin.com/"

    private var retrofit: Retrofit? = null

    fun api(): ApiService? {
        return RetrofitBuilder.getclient()
            .create(ApiService::class.java)
    }

    private fun getClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URLl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(
                    OkHttpClient.Builder().readTimeout(1, TimeUnit.MINUTES)
                        .writeTimeout(1, TimeUnit.MINUTES).build()
                )
                .build()
        }
        return retrofit
    }
}