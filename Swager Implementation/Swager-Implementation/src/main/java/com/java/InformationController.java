package com.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InformationController {
    @GetMapping("/Name")
    public String Name() {
        return "RK";
    }
}