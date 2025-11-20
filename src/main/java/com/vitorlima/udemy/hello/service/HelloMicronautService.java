package com.vitorlima.udemy.hello.service;

import jakarta.inject.Singleton;

@Singleton
public class HelloMicronautService implements MyService {

    @Override
    public String helloFromService() {

        return "Hello Micronaut!";
    }
}