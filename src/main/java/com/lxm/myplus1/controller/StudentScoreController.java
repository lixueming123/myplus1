package com.lxm.myplus1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class StudentScoreController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String testmvc() {
        return LocalDateTime.now() + ":testmvc=>" + port;
    }

}
