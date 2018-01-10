package com.example.yasuhiro.myapplication.di;

import android.content.Context;

import com.example.yasuhiro.myapplication.Pojo.Child;

import dagger.Module;
import dagger.Provides;

@Module
public class InfraLayerModule {
    @Provides
    public Child provideWeatherRepository(Context context){
        return new Child(context);
    }
}
