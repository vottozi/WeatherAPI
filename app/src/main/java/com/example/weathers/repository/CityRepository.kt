package com.example.weathers.repository

import com.example.weathers.Server.ApiServices

class CityRepository(val api:ApiServices) {
    fun getCities(q:String, limit:Int) = api.getCitiesList(q, limit, "04781163bc190d17059f19e5f69a50b7")
}