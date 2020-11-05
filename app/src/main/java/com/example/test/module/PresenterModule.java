package com.example.test.module;

import com.example.test.bean.Presenter;
import com.example.test.Scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @AppScope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
