package com.example.test.module;

import com.example.test.bean.Network;
import com.example.test.Scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    @AppScope
    @Provides
    public Network provideNetwork(){
        return new Network();
    }
}
