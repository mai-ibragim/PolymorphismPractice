package com.company;

public class Audi extends Car{
    private int price;

    public Audi(String name,int price) {
        super(name);
        this.price=price;
    }

    @Override
    void ride() {
        System.out.println("Audi rides fast");
    }
    void brake() {
        System.out.println("Audi is braking");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "price=" + price +
                "} " + super.toString();
    }
}
