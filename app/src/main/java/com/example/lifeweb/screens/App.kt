package com.example.lifeweb.screens

import android.app.Application
import com.example.lifeweb.repository.getProudct.GetProudactImpl
import com.example.lifeweb.repository.getProudct.GetProudct
import com.example.lifeweb.repository.remote.RetrofitBuilder
import com.example.lifeweb.screens.home.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        val module=module{
            single { RetrofitBuilder.apiService() }
            factory <GetProudct>{GetProudactImpl(get())}
            viewModel{MainViewModel(get())}
        }
        startKoin {
            androidContext(this@App)
            modules(module)

        }

    }
}