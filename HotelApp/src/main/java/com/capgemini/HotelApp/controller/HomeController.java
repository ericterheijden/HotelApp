package com.capgemini.HotelApp.controller;
import com.capgemini.HotelApp.model.Room;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LMANNA on 3-5-2017.
 */


// een @ staat voor annotatie (ook @Override)
// het is een referentie naar een stukje code
// Wat het eigenlijk doet is kijken of er restcontrollers zijn
// Zo ja, dan gaat het NIET naar de resources map
// En zoekt naar een RequestMapping methode
// Zit er geen RequestMapping in (wat niet vaak voorkomt) dan alsnog naar public

// controller is in staat data te returneren naar de browser
// Naam van de controller kan misschien worden veranderd naar iets relevanters

@RestController
public class HomeController {
    @RequestMapping(value="/rooms", method= RequestMethod.GET)
       public Room room(@RequestParam int input, @RequestParam String extra){
        Room room = new Room();
        room.setNumber(input);
        room.setType(extra);
        return room;
    }

    @RequestMapping(value="/rooms", method= RequestMethod.POST)
    public Room postroom(@RequestBody Room room){
         room.setNumber(88);
           return room;
    }


}
