package com.example.yasuhiro.myapplication.di;

import com.example.yasuhiro.myapplication.WeatherFacade;
import com.example.yasuhiro.myapplication.WeatherRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class AppLayerModule {
    @Provides
    public WeatherFacade provideWeatherFacade(WeatherRepository repository){
        return new WeatherFacade(repository);
    }

}
