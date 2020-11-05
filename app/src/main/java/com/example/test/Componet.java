package com.example.test;

import dagger.Component;

@Component(modules ={module.class})
public interface Componet {
    void inject(MainActivity mainActivity);
}
