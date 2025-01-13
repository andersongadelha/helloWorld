package br.com.zup.helloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/about")
    public String about() {
        return "Apenas um teste de spring boot...";
    }
}
