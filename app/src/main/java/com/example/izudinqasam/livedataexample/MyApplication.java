package com.example.izudinqasam.livedataexample;

import android.app.Application;

public class MyApplication extends Application {

    User user;
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        user = new User();
        instance = this;
    }

    public User getUser(){
        return user;
    }


    public static synchronized MyApplication getInstance(){
        return instance;
    }


}
