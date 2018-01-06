package com.example.yasuhiro.myapplication.di;

import android.content.Context;
import com.example.yasuhiro.myapplication.WeatherRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class InfraLayerModule {
    @Provides
    public WeatherRepository provideWeatherRepository(Context context){
        return new WeatherRepository(context);
    }
}
