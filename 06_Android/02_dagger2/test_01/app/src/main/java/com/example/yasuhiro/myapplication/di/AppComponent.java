package com.example.yasuhiro.myapplication.di;

import com.example.yasuhiro.myapplication.MainActivity;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {InfraLayerModule.class, AppLayerModule.class, AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
