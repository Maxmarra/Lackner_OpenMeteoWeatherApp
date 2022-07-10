package com.example.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)

/**
Каждый заголовок - это отдельный класс
по хорошему класс нужно назвать Hourly
но так как мы можем подставить реальное имя через
@field:Json(name = "hourly")
то мы дали свое название WeatherDto
Этот класс создан для хранения одного объекта
поля которого мы опишем в классе WeatherDataDto
{
    "latitude": 52.52,
    "longitude": 13.419,
    "elevation": 44.812,
    "generationtime_ms": 2.2119,
    "utc_offset_seconds": 0,
    "hourly": {
    "time": ["2021-08-28T00:00", "2021-08-28T01:00", "2021-08-28T02:00", ...],
    "temperature_2m": [13, 12.7, 12.7, 12.5, 12.5, 12.8, 13, 12.9, 13.3, ...]
    },
    "hourly_units": {
        "temperature_2m": "°C"
    },
    "current_weather": {
        "time": "2021-08-28T09:00",
        "temperature": 13.3,
        "weathercode": 3,
        "windspeed": 10.3,
        "winddirection": 262
    }
}


 */