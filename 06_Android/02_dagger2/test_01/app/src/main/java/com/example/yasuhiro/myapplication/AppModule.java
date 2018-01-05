package com.example.yasuhiro.myapplication;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yasuhiro on 18/01/04.
 */
@Module
public class AppModule {
    private final Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext(){
        return application.getApplicationContext();
    }
}

