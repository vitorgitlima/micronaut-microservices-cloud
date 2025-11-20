package com.vitorlima.udemy.hello.service;

import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {

    public String helloFromService() {

        return "Hello from service!";

    }
}