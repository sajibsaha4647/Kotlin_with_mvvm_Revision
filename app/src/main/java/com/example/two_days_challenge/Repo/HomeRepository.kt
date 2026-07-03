package com.example.two_days_challenge.Repo

import com.example.kotlin_project_structures_views.Network.ApiService

class PostRepository(private val apiService: ApiService) {

    suspend fun getPosts() = apiService.getPosts() ;
}