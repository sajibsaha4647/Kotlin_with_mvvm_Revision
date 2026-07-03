package com.example.two_days_challenge.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  ApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/") // Base URL for JSONPlaceholder
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}