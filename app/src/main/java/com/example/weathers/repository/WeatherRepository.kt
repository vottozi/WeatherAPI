package com.example.weathers.repository

import com.example.weathers.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat: Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"04781163bc190d17059f19e5f69a50b7")

    fun getForecastWeather(lat: Double,lng:Double,unit:String)=
        api.getForecastWeather(lat,lng,unit,"04781163bc190d17059f19e5f69a50b7")
}