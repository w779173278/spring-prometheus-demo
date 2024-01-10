package com.example.demoprometheus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("swagger")
public class SwaggerTestController {

    final List<String> sources = new ArrayList<>();


//    @ApiOperation(value = "", httpMethod = "GET")
    @GetMapping
    public Object list() {
        return sources;
    }
}
