package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/ping")
    public String ping() {
        return "Program says: 'pong!'";
    }

    @GetMapping(path = "/pong")
    public String pong() {
        return "Program says: 'ping'";
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "world!";
    }

}


