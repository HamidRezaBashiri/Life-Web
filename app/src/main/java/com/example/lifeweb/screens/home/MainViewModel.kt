package com.example.lifeweb.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.lifeweb.repository.Proudact
import com.example.lifeweb.repository.Resource
import com.example.lifeweb.repository.getProudct.GetProudct
import retrofit2.HttpException
import java.io.IOException

class MainViewModel(val getProudcts: GetProudct) :ViewModel(){

    val getProudact : LiveData<List<Proudact>> = liveData {
//        try {
//            emit(Resource.Loading())
            val result=getProudcts.getProudact()
            emit(result)
//        }catch (e:HttpException){
//             emit(Resource.Error("not found"))
//        }catch (e:IOException){
//            emit(Resource.Error("Not Net"))
//        }
    }

}