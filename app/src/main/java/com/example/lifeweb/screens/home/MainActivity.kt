package com.example.lifeweb.screens.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lifeweb.R
import com.example.lifeweb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}