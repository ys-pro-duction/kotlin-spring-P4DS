package com.ysproduction.demofirst2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MainController{

    @RequestMapping("/")
    public String rooString(){
        System.out.println("New User Live: "+System.currentTimeMillis());
        return "<b>Server Working</b>";
    }
}