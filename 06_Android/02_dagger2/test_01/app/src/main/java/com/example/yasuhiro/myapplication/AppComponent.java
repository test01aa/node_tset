package com.example.yasuhiro.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yasuhiro on 18/01/04.
 */

@Singleton
@Component(modules = {InfraLayerModule.class, AppLayerModule.class, AppModule.class})
public interface AppComponent {
    void inject(SecondActivity activity);
}
