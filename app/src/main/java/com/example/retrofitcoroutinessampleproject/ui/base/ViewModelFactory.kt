package com.example.retrofitcoroutinessampleproject.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitcoroutinessampleproject.data.api.ApiHelper
import com.example.retrofitcoroutinessampleproject.data.repository.MainRepository
import com.example.retrofitcoroutinessampleproject.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("ViewModel not found")
    }
}