package com.vitorlima.udemy.hello;

import com.vitorlima.udemy.hello.service.HelloWorldService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWorldController {

    @Inject
    private HelloWorldService service;

    @Get(processes = MediaType.TEXT_PLAIN)
    public String helloWorld(){

        return service.helloFromService();
    }
}
