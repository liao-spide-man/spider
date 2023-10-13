package com.example.spider.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class firstController {
    @GetMapping("/head")
    public String head(){
        return "commom/head";
    }

}
