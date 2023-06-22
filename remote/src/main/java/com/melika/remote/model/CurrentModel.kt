package com.melika.remote.model

import com.google.gson.annotations.SerializedName

data class CurrentModel(
    @SerializedName("observation_time")
    val time: String,
    @SerializedName("temparature")
    val temperature: Double,
    @SerializedName("weather_icons")
    val icons: List<String>,
    @SerializedName("weather_code")
    val code: Int,
    @SerializedName("weather_descriptions")
    val description: List<String>,
    @SerializedName("language")
    val language: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("name")
    val city: String,
)

