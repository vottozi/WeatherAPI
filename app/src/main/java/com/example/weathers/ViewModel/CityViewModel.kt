package com.example.weathers.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weathers.Server.ApiClient
import com.example.weathers.Server.ApiServices
import com.example.weathers.repository.CityRepository

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor():this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) = repository.getCities(q, limit)
}