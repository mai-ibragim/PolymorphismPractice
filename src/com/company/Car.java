package com.company;

public class Car {
    private String name;


    public Car(String name) {
        this.name = name;
    }

    void ride() {
        System.out.println("The car is riding");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
