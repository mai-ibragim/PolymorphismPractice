package com.company;

public class Porsche extends Car{
    private int speed;

    public Porsche(String name, int speed) {
        super(name);
        this.speed=speed;
    }

    @Override
    void ride() {
        System.out.println("Porsche rides the fastest");
    }
    void rideBack() {
        System.out.println("Porsche is riding back");
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
