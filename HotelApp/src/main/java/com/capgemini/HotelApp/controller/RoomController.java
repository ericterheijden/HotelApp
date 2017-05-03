package com.capgemini.HotelApp.controller;

import com.capgemini.HotelApp.model.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by JVERDUIJ on 3-5-2017.
 */
@RestController
public class RoomController {

    @RequestMapping(value = "/api/rooms/getAll", method = RequestMethod.GET)
    public ArrayList<Room> getAll() {
        ArrayList<Room> rooms = new ArrayList<Room>();

        Room room1 = new Room(1, "Kelder", 20.00);
        Room room2 = new Room(2, "Luxe", 30.00);
        Room room3 = new Room(3, "Zolder", 40.00);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        return rooms;
    }
}
