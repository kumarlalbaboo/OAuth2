package com.llb.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> getApplicationInfo() {
        return ResponseEntity.ok("Spring Boot Oauth2 Application");
    }

    @GetMapping("/contact-us")
    public ResponseEntity<String> sayContact() {
        return ResponseEntity.ok("Contact us: 7549662926");
    }

    @GetMapping("/about-us")
    public ResponseEntity<String> sayAbout() {
        return ResponseEntity.ok("About us: Spring Boot Oauth2 Application");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Say Hello World");
    }
}
