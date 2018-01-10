package com.example.yasuhiro.myapplication.Pojo;

import javax.inject.Inject;

public class Parent {
    private Child objChild;

    //ParentはModuleでprovideされているためDaggerがインスタンスを生成し注入してくれる
    @Inject
    public Parent(Child repository){
        this.objChild = repository;
    }

    public void Parent01(String msg){
        objChild.Child_01(msg);
    }
}
