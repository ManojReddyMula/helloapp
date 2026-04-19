package com.sample.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/Hellow")
public class Hello {

    @GetMapping("/meassage")
    public String Message(){

        return "welcome to ci&& cd Pipeline ";
    }

}
