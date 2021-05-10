package com.uwjx.springfunction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "devtools")
public class DevToolsController {

    @GetMapping
    public String t1(){


        return "t1";
    }
}
