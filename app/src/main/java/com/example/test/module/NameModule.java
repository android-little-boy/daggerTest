package com.example.test.module;

import com.example.test.bean.Name;
import com.example.test.Scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class NameModule {
    @AppScope
    @Provides
    public Name provideName(){
        return new Name();
    }
}
