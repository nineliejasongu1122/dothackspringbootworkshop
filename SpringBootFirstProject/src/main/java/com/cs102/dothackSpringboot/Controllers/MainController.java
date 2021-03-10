package com.cs102.dothackSpringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(path = "/get/test1")
    public String getWithNothing(){
        return "WELCOME TO .hack SPRING BOOT WORKSHOP";
    }

    @GetMapping(path = "/get/test2/{text}")
    public String getWithPathVar(@PathVariable String text){
        return "The Text is: " + text;
    }

    @GetMapping(path = "/get/test3")
    public String getWithRequestParam(@RequestParam String text){
        return "The Text is: " + text;
    }


    @GetMapping(path = "/get/test4")
    public String getWithDefaultParam(@RequestParam (defaultValue = "I always love java") String text){
        return "The Text is: " + text;
    }
}
