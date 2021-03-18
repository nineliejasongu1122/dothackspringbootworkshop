package com.cs102.dothackSpringboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @GetMapping(path = "/get/test1")
    public String getWithNothing() {
        return "WELCOME TO .hack SPRING BOOT WORKSHOP";
    }

    @GetMapping(path = "/get/test2/{text}")
    public String getWithPathVar(@PathVariable String text) {
        return "The Text is: " + text;
    }

    @GetMapping(path = "/get/test3")
    public String getWithRequestParam(@RequestParam String text) {
        return "The Text is: " + text;
    }


    @GetMapping(path = "/get/test4")
    public String getWithDefaultParam(@RequestParam(defaultValue = "2021-03-01") String dt) {
        //Implement a rest api
        RestTemplate restTemplate = new RestTemplate();
        String link = "https://api.data.gov.sg/v1/environment/air-temperature?date=%s";
        link = String.format(link, dt);
        ResponseEntity<String> response = restTemplate
                .getForEntity(link, String.class);
        return "The Text is: " + response;
    }
}
