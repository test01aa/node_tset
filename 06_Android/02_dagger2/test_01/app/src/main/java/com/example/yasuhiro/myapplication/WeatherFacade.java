package com.example.yasuhiro.myapplication;

import javax.inject.Inject;

/**
 * Created by yasuhiro on 18/01/04.
 */

public class WeatherFacade {
    private WeatherRepository repository;

    @Inject
    public WeatherFacade(WeatherRepository repository){
        this.repository = repository;
    }

    public void fetchWeather(String cityCode){
        repository.fetchWeather(cityCode);
    }
}
