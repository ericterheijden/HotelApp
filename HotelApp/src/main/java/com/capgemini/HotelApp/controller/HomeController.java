package com.capgemini.HotelApp.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LMANNA on 3-5-2017.
 */

@RestController
// een @ staat voor annotatie (ook @Override)
// het is een referentie naar een stukje code

// controller is in staat data te returneren naar de browser
// Naam van de controller kan misschien worden veranderd naar iets relevanters 


public class HomeController {
    @RequestMapping("/")
    public String home (){
        return "Hello World";
    }
}
