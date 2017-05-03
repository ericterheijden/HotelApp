package com.capgemini.HotelApp.model;

/**
 * Created by JVERDUIJ on 3-5-2017.
 */
public class Room {

    public Room(int number,String type, double price){
        this.number=number;
        this.type=type;
        this.price=price;

    }

    public Room() {}

    private int number;
    private String type;
    private double price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
