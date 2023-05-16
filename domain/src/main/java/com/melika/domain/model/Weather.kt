package com.melika.domain.model

import java.util.Date

data class Weather(
    val time: Date,
    val temp: Double,
    val city: String,
    val country: String,
    val chanceOfRain: String,
    val language: String,
    val weatherType: WeatherType,
)
