package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestController {
    @GetMapping(value = "/v1/ping")
    public Mono<String> getDeauContents() {
        return Mono.just("pong");
    }
}
