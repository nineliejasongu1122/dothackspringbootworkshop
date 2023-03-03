package com.cs102.dothackSpringboot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs102.dothackSpringboot.classes.Counter;

@RestController
public class MainController {

    Counter counter = new Counter();

    @PostMapping(path = "demo/pray")
    public void pray() {
        counter.increment();
    }

    @GetMapping(path = "demo/test1")
    public String test1() {
        return "Welcome to dot hack workshop";
    }

    @GetMapping(path = "demo/display")
    public String display() {
        return "Total prayers: " + counter.getCount();
    }
}
