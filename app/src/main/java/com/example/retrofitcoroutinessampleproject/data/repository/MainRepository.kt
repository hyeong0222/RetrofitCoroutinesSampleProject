package com.example.retrofitcoroutinessampleproject.data.repository

import com.example.retrofitcoroutinessampleproject.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}