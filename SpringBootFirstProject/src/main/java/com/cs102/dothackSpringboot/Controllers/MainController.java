package com.cs102.dothackSpringboot.Controllers;

import com.cs102.dothackSpringboot.entity.Email;
import com.cs102.dothackSpringboot.entity.EmailDTO;
import com.cs102.dothackSpringboot.utility.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @Autowired
    EmailUtil emailUtil;

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

    @PostMapping(path = "/get/test5")
    public String simpleEmailTest(@RequestBody EmailDTO email) throws IOException, MessagingException {
        Email mail = new Email();
        mail.setMailTo(email.getEmail());//replace with your desired email
        mail.setFrom("nineliejasongu@gmail.com");
        mail.setSubject(email.getSubject());
        emailUtil.sendSimpleEmail(mail,email.getMessage());
        return "SUCCESSED";
    }

    @PostMapping(path = "/get/test6")
    public String emailWithTemplateTest(@RequestBody EmailDTO email) throws IOException, MessagingException {
        Email mail = new Email();
        mail.setMailTo(email.getEmail());//replace with your desired email
        mail.setFrom("nineliejasongu@gmail.com");
        mail.setSubject(email.getSubject());
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", email.getName());
        model.put("message", email.getMessage());
        mail.setProps(model);
        emailUtil.sendEmailWithTemplate(mail, "test-email-template");
        return "SUCCESSED";
    }
}
