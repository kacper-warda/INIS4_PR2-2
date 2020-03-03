package com.company.devices;

public class Car {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    private String plates;
    public final Double value = 10000.0;

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String toString(){
        return this.producer + " " + this.model;
    }
}
