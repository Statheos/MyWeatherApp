package com.bawp.jetweatherforecast.network

import com.bawp.jetweatherforecast.model.Weather
import com.bawp.jetweatherforecast.model.WeatherObject
import com.bawp.jetweatherforecast.utils.Constants
import com.bawp.jetweatherforecast.utils.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET(value = "data/2.5/forecast/daily")
    suspend fun getWeather(
        @Query("q") query : String,
        @Query("units") units: String = "imperial",
        @Query("appid") appid: String = "15748495657c0a38a8e2d6e26326d19d" // your api key
                          ): Weather
}