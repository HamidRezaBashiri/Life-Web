package com.example.lifeweb.repository.remote

import com.example.lifeweb.repository.Proudact
import retrofit2.http.GET

interface Api_Interface {

    @GET("flutter/products_list.json")
    suspend fun getProudact() : List<Proudact>
    companion object {

        var BASE_URL = "http://welearnacademy.ir/"
    }

}