package com.capgemini.HotelApp.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LMANNA on 3-5-2017.
 */

@RestController
// is in staat data te returneren naar de browser

public class HomeController {
    @RequestMapping("/")
    public String home (){
        return "Hello World";
    }
}
