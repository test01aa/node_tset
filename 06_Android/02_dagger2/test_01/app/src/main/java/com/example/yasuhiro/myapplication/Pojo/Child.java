package com.example.yasuhiro.myapplication.Pojo;

import android.content.Context;
import javax.inject.Inject;

public class Child {
    private Context mContext;
    @Inject
    public Child(Context context){
        mContext = context;
    }

    public void Child_01(String msg) {
        System.out.println("■■■■■ " + msg );
    }
}
