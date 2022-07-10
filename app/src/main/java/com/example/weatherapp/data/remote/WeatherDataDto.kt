package com.example.weatherapp.data.remote

import com.squareup.moshi.Json
/**
 поля согласно выбранному набору в WeatherApi
 все типы можно увидеть при запросе в браузере
 везде стоит @field:Json(name =
 так как мы не хотим использовать имя из запроса
 а назначить свое, и только поле time мы не меняем
 так как у него такое же название в запросе.

 */
data class WeatherDataDto(

    val time: List<String>,

    @field:Json(name = "temperature_2m")
    val temperatures: List<Double>,

    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,

    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,

    @field:Json(name = "windspeed_10m")
    val windSpeeds: List<Double>,

    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
)