package com.company.devices;

public class Device {

    public String producer;
    public String model;
    public Integer yearOfProduction;
    public final Double value = 10000.0;

    public String toString(){
        return this.producer + " " + this.model;
    }

}
