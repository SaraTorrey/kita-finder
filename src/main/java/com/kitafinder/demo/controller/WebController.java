package com.kitafinder.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping( "/" )
    public String mainPage() {

        return "index";
    }

    @GetMapping( "/other" )
    public String other() {

        //


        return "other";
    }

}