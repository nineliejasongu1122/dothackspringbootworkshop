package com.cs102.dothackSpringboot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(path = "demo/test1")
    public String test1() {
        return "Pray to Jason Gu Yao Chen";
    }
}
