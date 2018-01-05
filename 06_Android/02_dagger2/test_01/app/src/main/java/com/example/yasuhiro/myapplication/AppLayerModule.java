package com.example.yasuhiro.myapplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yasuhiro on 18/01/04.
 */
@Module
public class AppLayerModule {
    @Provides
    public WeatherFacade provideWeatherFacade(WeatherRepository repository){
        return new WeatherFacade(repository);
    }

}
