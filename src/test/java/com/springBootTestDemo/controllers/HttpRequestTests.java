package com.springBootTestDemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void greetingShouldReturnDefaultMessage() {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .isEqualTo("Hello World!");
    }

    @Test
    void greetingShouldReturnWithTheGivenName() {
        String username = "Prasad";
        String url = "http://localhost:" + port + "/username/" + username;

        assertThat(restTemplate.getForObject(url, String.class))
        .isEqualTo("Hello Prasad!");
    }
}
