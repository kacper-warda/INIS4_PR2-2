package com.company.devices;

public class Car extends Device {

    private String plates;

    public String getPlates() {
        return plates;
    }
    public void setPlates(String plates) {
        this.plates = plates;
    }

    @Override
    void turnOn() {
        System.out.println("Now car is working");
    }

    @Override
    public void sell() {
        System.out.println("Car sold");
    }
}
