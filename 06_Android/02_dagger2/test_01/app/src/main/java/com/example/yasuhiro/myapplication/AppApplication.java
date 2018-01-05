package com.example.yasuhiro.myapplication;

import android.app.Application;

/**
 * Created by yasuhiro on 18/01/04.
 */

public class AppApplication extends Application{
    private AppComponent applicationComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getApplicationComponent(){
        return applicationComponent;
    }
}
