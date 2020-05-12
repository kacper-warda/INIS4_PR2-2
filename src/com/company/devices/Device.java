package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {

    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double value = 10000.0;

    public String toString(){
        return this.producer + " " + this.model;
    }

    abstract void turnOn();

}
