package com.examle.formdatajacksonbug;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

@RestController
public class DummyController {
    @PostMapping
    public String dummyMethod(ServerWebExchange exchange, Request request) {
        return "";
    }

    public static class Request {
    }
}