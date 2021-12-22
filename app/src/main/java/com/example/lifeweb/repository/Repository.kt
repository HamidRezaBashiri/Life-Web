package com.example.lifeweb.repository

import com.example.lifeweb.repository.remote.Api_Interface
import retrofit2.Call

import retrofit2.Response

class Repository {

    val apiInterface = Api_Interface.create().getMovies()
    apiInterface.enqueue(
    object : javax.security.auth.callback.Callback<List<Products>>,
        retrofit2.Callback<List<Products>> {
        override fun onResponse(
            call: Call<List<Products>>,
            response: Response<List<Products>>
        ) {
            TODO("Not yet implemented")
        }

        override fun onFailure(call: Call<List<Products>>, t: Throwable) {
            TODO("Not yet implemented")
        }

    })


}