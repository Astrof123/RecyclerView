package com.example.recyclerview

class WeatherItem {
    var date: String
    var day: String
    var weather: String
    var day_degrees: Int
    var night_degrees: Int

    constructor(_date: String, _day: String, _weather: String, _day_degrees: Int, _night_degrees: Int) {
        date = _date
        day = _day
        weather = _weather
        day_degrees = _day_degrees
        night_degrees = _night_degrees
    }
}