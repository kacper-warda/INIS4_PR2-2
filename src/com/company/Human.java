package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal{
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 2000.0;

    public Human() {
        super("homo sapiens");
    }


    public Double getSalary() {
        return salary;
    }

    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) throws Exception {
        if (car.value > this.salary * 12) {
            throw new Exception("nie stać cie, sorry");
        } else {
            this.car = car;
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
