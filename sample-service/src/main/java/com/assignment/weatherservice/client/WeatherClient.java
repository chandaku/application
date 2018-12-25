package com.assignment.weatherservice.client;

import com.assignment.weatherservice.model.Location;
import com.assignment.weatherservice.model.WeatherReport;
import reactor.core.publisher.Mono;

public interface WeatherClient {
    Mono<WeatherReport> getWeatherReport(Location location);
}
