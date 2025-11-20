package com.vitorlima.udemy.hello.controller;

import com.vitorlima.udemy.hello.service.MyService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWorldController {


    private final MyService service;

    public HelloWorldController(MyService service) {
        this.service = service;
    }

    @Get(processes = MediaType.TEXT_PLAIN)
    public String helloWorld(){

        return service.helloFromService();
    }
}
