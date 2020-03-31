package com.company.devices;

public class Phone extends Device {

    @Override
    void turnOn() {
        System.out.println("Hello");
    }

    @Override
    public void sell() {
        System.out.println("Phone sold");
    }
}
