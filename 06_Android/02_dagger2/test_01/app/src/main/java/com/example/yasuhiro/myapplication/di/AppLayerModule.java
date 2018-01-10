package com.example.yasuhiro.myapplication.di;

import com.example.yasuhiro.myapplication.Pojo.Child;
import com.example.yasuhiro.myapplication.Pojo.Parent;

import dagger.Module;
import dagger.Provides;

@Module
public class AppLayerModule {
    @Provides
    public Parent provideWeatherFacade(Child repository){
        return new Parent(repository);
    }
}
