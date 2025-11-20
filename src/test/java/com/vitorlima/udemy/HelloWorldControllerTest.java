package com.vitorlima.udemy;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void helloWorldEndpointRespondsWithTextHelloWorld() {

        String response = httpClient.toBlocking().retrieve("/hello");

        assertEquals("Hello world!", response);

    }

   @Test
    void helloWorldEndpointRespondsWithStatusCode200(){

       var response = httpClient.toBlocking().exchange("/hello", String.class);

      assertEquals(HttpStatus.OK, response.getStatus());
      assertEquals("Hello world!", response.getBody().get());

   }

}
