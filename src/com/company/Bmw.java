package com.company;

public class Bmw extends Car{
    private int weight;

    public Bmw(String name,int weight) {
        super(name);
        this.weight=weight;
    }

    @Override
    void ride() {
        System.out.println("BMW rides faster");
    }
    void turn() {
        System.out.println("BMW is turning over");
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
