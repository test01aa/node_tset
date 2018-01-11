package com.example.yasuhiro.myapplication;

import android.app.Application;
import com.example.yasuhiro.myapplication.di.*;

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
                .parentModule(new ParentModule())
                .childModule(new ChildModule())
                .build();
    }

    public AppComponent getApplicationComponent(){
        return applicationComponent;
    }
}
