package com.example.yasuhiro.myapplication.di;

import com.example.yasuhiro.myapplication.Pojo.Child;
import com.example.yasuhiro.myapplication.Pojo.Parent;

import dagger.Module;
import dagger.Provides;

@Module
public class ParentModule {
    @Provides
    public Parent provideParent(Child child){
        return new Parent(child);
    }
}
