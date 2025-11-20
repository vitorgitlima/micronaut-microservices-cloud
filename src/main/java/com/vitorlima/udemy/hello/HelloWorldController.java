package com.vitorlima.udemy.hello;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    @Get(processes = MediaType.TEXT_PLAIN)
    public String helloWorld(){

        return "Hello world!";
    }

}
