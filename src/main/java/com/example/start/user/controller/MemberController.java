package com.example.start.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Around Hub Studio!";
    }
    @PostMapping("/join")
    public String join() {
        return "string";
    }


}
