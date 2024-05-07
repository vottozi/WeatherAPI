package com.example.weathers.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weathers.Server.ApiClient
import com.example.weathers.Server.ApiServices
import com.example.weathers.repository.WeatherRepository

class WeatherViewModel(val repository: WeatherRepository): ViewModel() {
    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double,lng:Double,unit:String)=
        repository.getCurrentWeather(lat,lng,unit)

    fun loadForecastWeather(lat:Double,lng:Double,unit:String)=
        repository.getForecastWeather(lat,lng,unit)
}