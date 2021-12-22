package com.example.lifeweb.repository.getProudct

import com.example.lifeweb.repository.Proudact
import com.example.lifeweb.repository.remote.Api_Interface

class GetProudactImpl(val apiService: Api_Interface):GetProudct {
    override suspend fun getProudact(): List<Proudact> = apiService.getProudact()

}