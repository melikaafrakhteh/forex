package com.melika.domain.usecase

import com.melika.domain.model.Weather
import com.melika.domain.repository.WeatherRepository

class GetCurrentWeather(private val repository: WeatherRepository) {
    suspend operator fun invoke(): Weather {
        return repository.getCurrentWeather()
    }
}