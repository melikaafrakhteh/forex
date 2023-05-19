package com.melika.data.mapper

import com.melika.data.model.WeatherDto
import com.melika.domain.model.Weather
import javax.inject.Inject

class WeatherMapper @Inject constructor(): ModelMapper<Weather, WeatherDto> {
    override fun mapToFirst(second: WeatherDto): Weather {
        return Weather(
            time = second.time,
            temp = second.temp,
            city = second.city,
            country = second.country,
            chanceOfRain = second.chanceOfRain,
            language = second.language,
            weatherType = second.weatherType,
        )
    }

    override fun mapToSecond(first: Weather): WeatherDto {
        return WeatherDto(
            time = first.time,
            temp = first.temp,
            city = first.city,
            country = first.country,
            chanceOfRain = first.chanceOfRain,
            language = first.language,
            weatherType = first.weatherType,
        )
    }
}