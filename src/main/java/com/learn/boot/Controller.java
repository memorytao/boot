package com.learn.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping(path = "/current-time")
    public String currentTime() {
        return String.valueOf(new Date().getTime());
    }

    @GetMapping(path = "/")
    public String index() {
        return "It's work!";
    }

    @PostMapping(path = "/ask")
    public String getAnswer() {

        // RestTemplate restTemplate = new RestTemplate();
        return "";
    }

}
