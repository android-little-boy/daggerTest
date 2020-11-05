package com.example.test;

import dagger.Module;
import dagger.Provides;

@Module
public class module {
    @Provides
    public Name provideName(){
        return new Name();
    }
}
