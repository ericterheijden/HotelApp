package com.capgemini.HotelApp.model.kamers;

/**
 * Created by JVERDUIJ on 3-5-2017.
 */
public class Room {

    public Room(int number, ETypeRoom type, double price){
        this.number=number;
        this.price=price;
        this.type=type;
    }

    public Room() {}

    private int number;
    private double price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private ETypeRoom type;

    public void setType(ETypeRoom type) {
        this.type = type;
    }

    public ETypeRoom getType(){
        return type;
    }
}
