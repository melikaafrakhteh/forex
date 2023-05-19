package com.melika.data.model

import com.melika.domain.model.WeatherType
import java.util.*

data class WeatherDto(
    val time: Date,
    val temp: Double,
    val city: String,
    val country: String,
    val chanceOfRain: String,
    val language: String,
    val weatherType: WeatherType,
)
