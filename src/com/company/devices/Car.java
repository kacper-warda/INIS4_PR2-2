package com.company.devices;

import com.company.creatures.Human;

import java.util.LinkedList;
import java.util.List;

public class Car extends Device implements Comparable<Car> {

    private String plates;
    public List<Human> owners = new LinkedList<Human>();

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    @Override
    void turnOn() {
        System.out.println("Now car is working");
    }

    @Override
    public void sell() {
        System.out.println("Car sold");
    }

    @Override
    public int compareTo(Car o) {
        return o.value.intValue() - this.value.intValue();
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        //sprawdź czy kupujący ma pieniędze
        //sprawdź czy sprzedający ma samochód
        //zamień właścicieli
        //wymień gotówkę
        if (buyer.couldBuyCar(this, price) && seller.hasCar(this)) {
            buyer.setCar(this);
            seller.removeCar(this);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("transakcja się udała " + seller + " sprzedał " + this + " do " + buyer);
        }


    }
}
