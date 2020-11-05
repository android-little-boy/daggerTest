package com.example.test.Component;

import com.example.test.MainActivity;
import com.example.test.Scope.AppScope;
import com.example.test.SecActivity;
import com.example.test.module.NameModule;
import com.example.test.module.NetworkModule;
import com.example.test.module.PresenterModule;

import dagger.Component;
@AppScope
@Component(modules ={NameModule.class, PresenterModule.class, NetworkModule.class},dependencies = {PersonComponent.class})
public interface MyComponent {
    void inject(MainActivity mainActivity);
    void inject(SecActivity secActivity);
}
