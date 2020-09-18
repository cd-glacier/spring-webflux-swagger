package com.example.swagger.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import reactor.core.publisher.Mono;

@RestController
public class TestController {


    @ApiResponses(value = {@ApiResponse(responseCode = "200")})
    @GetMapping(value = "/v1/ping")
    public Mono<String> getDeauContents(
            @RequestParam(name = "message", required = true) Optional<String> message
    ) {
        return Mono.just("pong");
    }
}
