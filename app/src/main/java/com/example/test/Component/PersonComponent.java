package com.example.test.Component;


import com.example.test.bean.Person;
import com.example.test.Scope.PsScope;
import com.example.test.module.PersonModule;

import dagger.Component;
@PsScope
@Component(modules = PersonModule.class)
public interface PersonComponent {
    public Person providePerson();
}
