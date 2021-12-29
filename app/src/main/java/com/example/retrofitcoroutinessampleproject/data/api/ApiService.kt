package com.example.retrofitcoroutinessampleproject.data.api

import com.example.retrofitcoroutinessampleproject.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}