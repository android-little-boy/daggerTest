package com.example.test;

import android.app.Application;

import com.example.test.Component.DaggerMyComponent;
import com.example.test.Component.DaggerPersonComponent;
import com.example.test.Component.MyComponent;
import com.example.test.module.NameModule;
import com.example.test.module.NetworkModule;
import com.example.test.module.PresenterModule;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent= DaggerMyComponent.builder()
                .nameModule(new NameModule())
                .presenterModule(new PresenterModule())
                .personComponent(DaggerPersonComponent.create())
                .networkModule(new NetworkModule())
                .build();
    }
    public MyComponent getAppComponent(){
        return myComponent;
    }
}
