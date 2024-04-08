package com.doenervergleich.back.doenervergleich.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping
    public String getHelloWorld(@RequestBody String testId) {
        return testId;
    }



}
