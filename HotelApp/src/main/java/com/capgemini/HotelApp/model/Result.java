package com.capgemini.HotelApp.model;

/**
 * Created by LMANNA on 4-5-2017.
 */
public class Result {
    String name;
    int age;
    String loc;
    boolean submit;

    public Result(String name, int age, String loc, boolean submit) {
        this.name = name;
        this.age = age;
        this.loc = loc;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public Result() {

    }
}
