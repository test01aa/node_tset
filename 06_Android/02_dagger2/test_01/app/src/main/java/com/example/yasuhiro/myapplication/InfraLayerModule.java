package com.example.yasuhiro.myapplication;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yasuhiro on 18/01/04.
 */

@Module
public class InfraLayerModule {
    @Provides
    public WeatherRepository provideWeatherRepository(Context context){
        return new WeatherRepository(context);
    }
}
