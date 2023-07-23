package com.auchan.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @GetMapping("/funct1")
    public String function1() {
        return "Hello, World from function 1 !";
    }

        @GetMapping("/funct2")
    public String function2() {
        return "Hello, World from function 2!";
    }

        @GetMapping("/funct3")
    public String function3() {
        return "Hello, World from function 3!";
    }

        @GetMapping("/funct4")
    public String function4() {
        return "Hello, World from function 4!";
    }

}