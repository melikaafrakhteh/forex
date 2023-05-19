package com.melika.domain.repository

import com.melika.domain.model.Weather

interface WeatherRepository {

    suspend fun getCurrentWeather(): Weather

}