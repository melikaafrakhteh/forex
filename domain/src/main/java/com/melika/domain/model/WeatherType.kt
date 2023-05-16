package com.melika.domain.model

sealed class WeatherType(
    val code: Int,
    val icon: String,
) {
    object Sunny : WeatherType(
        code = 113,
        icon = "https://assets.weatherstack.com/images/wsymbol_0012_heavy_snow_showers"
    )
    object PartlyCloudy : WeatherType(
        code = 116,
        icon = "https://assets.weatherstack.com/images/wsymbol_0002_sunny_intervals"
    )
    object Cloudy : WeatherType(
        code = 119,
        icon = "https://assets.weatherstack.com/images/wsymbol_0003_white_cloud"
    )
    object Overcast : WeatherType(
        code = 122,
        icon = "https://assets.weatherstack.com/images/wsymbol_0004_black_low_cloud"
    )
    object Mist : WeatherType(
        code = 143,
        icon = "https://assets.weatherstack.com/images/wsymbol_0006_mist"
    )
    object PatchyRainNearby : WeatherType(
        code = 176,
        icon = "https://assets.weatherstack.com/images/wsymbol_0009_light_rain_showers"
    )
    object PatchySnowNearby : WeatherType(
        code = 179,
        icon = "https://assets.weatherstack.com/images/wsymbol_0013_sleet_showers"
    )
    object PatchySleetNearby : WeatherType(
        code = 182,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object PatchyFreezingDrizzleNearby : WeatherType(
        code = 185,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object ThunderyOutbreaksInNearby : WeatherType(
        code = 200,
        icon = "https://assets.weatherstack.com/images/wsymbol_0016_thundery_showers"
    )
    object BlowingSnow : WeatherType(
        code = 227,
        icon = "https://assets.weatherstack.com/images/wsymbol_0019_cloudy_with_light_snow"
    )
    object Blizzard : WeatherType(
        code = 230,
        icon = "https://assets.weatherstack.com/images/wsymbol_0020_cloudy_with_heavy_snow"
    )
    object Fog : WeatherType(
        code = 248,
        icon = "https://assets.weatherstack.com/images/wsymbol_0007_fog"
    )
    object FreezingFog : WeatherType(
        code = 260,
        icon = "https://assets.weatherstack.com/images/wsymbol_0007_fog"
    )
    object PatchyLightDrizzle : WeatherType(
        code = 263,
        icon = "https://assets.weatherstack.com/images/wsymbol_0009_light_rain_showers"
    )
    object LightDrizzle : WeatherType(
        code = 266,
        icon = "https://assets.weatherstack.com/images/wsymbol_0017_cloudy_with_light_rain"
    )
    object FreezingDrizzle : WeatherType(
        code = 281,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object HeavyFreezingDrizzle : WeatherType(
        code = 284,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object PatchyLightRain : WeatherType(
        code = 293,
        icon = "https://assets.weatherstack.com/images/wsymbol_0017_cloudy_with_light_rain"
    )
    object LightRain : WeatherType(
        code = 296,
        icon = "https://assets.weatherstack.com/images/wsymbol_0017_cloudy_with_light_rain"
    )
    object ModerateRainAtTimes : WeatherType(
        code = 299,
        icon = "https://assets.weatherstack.com/images/wsymbol_0010_heavy_rain_showers"
    )
    object ModerateRain : WeatherType(
        code = 302,
        icon = "https://assets.weatherstack.com/images/wsymbol_0018_cloudy_with_heavy_rain"
    )
    object HeavyRainAtTimes : WeatherType(
        code = 305,
        icon = "https://assets.weatherstack.com/images/wsymbol_0010_heavy_rain_showers"
    )
    object HeavyRain : WeatherType(
        code = 308,
        icon = "https://assets.weatherstack.com/images/wsymbol_0018_cloudy_with_heavy_rain"
    )
    object LightFreezingRain : WeatherType(
        code = 311,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object ModerateOrHeavyFreezingRain : WeatherType(
        code = 314,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object LightSleet : WeatherType(
        code = 317,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object ModerateOrHeavySleet : WeatherType(
        code = 320,
        icon = "https://assets.weatherstack.com/images/wsymbol_0019_cloudy_with_light_snow"
    )
    object PatchyLightSnow : WeatherType(
        code = 323,
        icon = "https://assets.weatherstack.com/images/wsymbol_0011_light_snow_showers"
    )
    object LightSnow : WeatherType(
        code = 326,
        icon = "https://assets.weatherstack.com/images/wsymbol_0011_light_snow_showers"
    )
    object PatchyModerateSnow : WeatherType(
        code = 329,
        icon = "https://assets.weatherstack.com/images/wsymbol_0020_cloudy_with_heavy_snow"
    )
    object ModerateSnow : WeatherType(
        code = 332,
        icon = "https://assets.weatherstack.com/images/wsymbol_0020_cloudy_with_heavy_snow"
    )
    object PatchyHeavySnow : WeatherType(
        code = 335,
        icon = "https://assets.weatherstack.com/images/wsymbol_0012_heavy_snow_showers"
    )
    object HeavySnow : WeatherType(
        code = 338,
        icon = "https://assets.weatherstack.com/images/wsymbol_0020_cloudy_with_heavy_snow"
    )
    object IcePellets : WeatherType(
        code = 350,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object LightRainShower : WeatherType(
        code = 353,
        icon = "https://assets.weatherstack.com/images/wsymbol_0009_light_rain_showers"
    )
    object ModerateOrHeavyRainShower : WeatherType(
        code = 356,
        icon = "https://assets.weatherstack.com/images/wsymbol_0010_heavy_rain_showers"
    )
    object TorrentialRainShower : WeatherType(
        code = 359,
        icon = "https://assets.weatherstack.com/images/wsymbol_0018_cloudy_with_heavy_rain"
    )
    object LightSleetShowers : WeatherType(
        code = 362,
        icon = "https://assets.weatherstack.com/images/wsymbol_0013_sleet_showers"
    )
    object ModerateOrHeavySleetShowers : WeatherType(
        code = 365,
        icon = "https://assets.weatherstack.com/images/wsymbol_0013_sleet_showers"
    )
    object LightSnowShowers : WeatherType(
        code = 368,
        icon = "https://assets.weatherstack.com/images/wsymbol_0011_light_snow_showers"
    )
    object ModerateOrHeavySnowShowers : WeatherType(
        code = 371,
        icon = "https://assets.weatherstack.com/images/wsymbol_0012_heavy_snow_showers"
    )
    object LightShowersOfIcePellets : WeatherType(
        code = 374,
        icon = "https://assets.weatherstack.com/images/wsymbol_0013_sleet_showers"
    )
    object ModerateOrHeavyShowersOfIcePellets : WeatherType(
        code = 377,
        icon = "https://assets.weatherstack.com/images/wsymbol_0021_cloudy_with_sleet"
    )
    object PatchyLightRainInAreaWithThunder : WeatherType(
        code = 386,
        icon = "https://assets.weatherstack.com/images/wsymbol_0016_thundery_showers"
    )
    object ModerateOrHeavyRainInAreaWithThunder : WeatherType(
        code = 389,
        icon = "https://assets.weatherstack.com/images/wsymbol_0024_thunderstorms"
    )
    object PatchyLightSnowInAreaWithThunder : WeatherType(
        code = 392,
        icon = "https://assets.weatherstack.com/images/wsymbol_0016_thundery_showers"
    )
    object ModerateOrHeavySnowInAreaWithThunder : WeatherType(
        code = 395,
        icon = "https://assets.weatherstack.com/images/wsymbol_0012_heavy_snow_showers"
    )
}