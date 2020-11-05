package com.example.test.module;

import com.example.test.bean.Person;
import com.example.test.Scope.PsScope;

import dagger.Module;
import dagger.Provides;
@Module
public class PersonModule {
    @PsScope
    @Provides
    public Person providePerson(){
        return new Person();
    }
}
