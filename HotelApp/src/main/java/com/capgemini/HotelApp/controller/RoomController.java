package com.capgemini.HotelApp.controller;

import com.capgemini.HotelApp.model.Input;
import com.capgemini.HotelApp.model.Result;
import com.capgemini.HotelApp.model.kamers.ETypeRoom;
import com.capgemini.HotelApp.model.kamers.Luxe;
import com.capgemini.HotelApp.model.kamers.Room;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by JVERDUIJ on 3-5-2017.
 */

@RestController
public class RoomController {

    @RequestMapping(value = "/api/requestroom", method = RequestMethod.POST)
    public Room getAll(@RequestBody Input input) {
        ArrayList<Room> rooms = new ArrayList<Room>();

        Room room1 = new Room(1, ETypeRoom.Luxe, 20.00);
        Room room2 = new Room(2, ETypeRoom.Standaard, 30.00);
        Room room3 = new Room(3, ETypeRoom.Standaard, 40.00);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        return rooms.get(input.getNumber());

    }
}
