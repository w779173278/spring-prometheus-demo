package com.example.demoprometheus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("timed")
public class TimedTestController {

//    @Timed
    @GetMapping
    public String sce5() throws InterruptedException {
        Thread.sleep(1000 * 5);
        return "success";
    }
}
