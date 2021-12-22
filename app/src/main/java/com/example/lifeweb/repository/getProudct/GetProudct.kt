package com.example.lifeweb.repository.getProudct

import com.example.lifeweb.repository.Proudact

interface GetProudct {
    suspend fun getProudact():List<Proudact>
}