package com.example.yasuhiro.myapplication;

import android.content.Context;
import javax.inject.Inject;

public class WeatherRepository {
    private Context mContext;
    @Inject
    public WeatherRepository(Context context){
        mContext = context;
    }

    public void fetchWeather(String cityCode) {
        System.out.println("■■■■■ " + cityCode );
    }
}
