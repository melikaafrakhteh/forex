package com.melika.remote.service

import com.melika.remote.model.CurrentModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current")
    suspend fun getCurrentWeather(
        @Query("query") query: String,
    ): CurrentModel
}