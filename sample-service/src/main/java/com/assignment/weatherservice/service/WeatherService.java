package com.assignment.weatherservice.service;

import com.assignment.weatherservice.domain.Weather;

import java.time.LocalDate;

public interface WeatherService {
    Weather getWeather(LocalDate date, String country);
}
