package com.sample.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/Hellow")
public class Hello {

    @GetMapping("/meassage")
    public String Message() {

        return "welcome to ci&& cd Pipeline ";
    }

        @GetMapping("/final")
                public  String Test(){

            return "Thanks Ci & cd pipeline setup Everything";

    }

    @GetMapping("/test")
    public String Task(){

        return " cod pushed github, docker images created, pushed into docker hub";

    }



}
