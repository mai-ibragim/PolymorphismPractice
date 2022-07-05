package com.company;

public class Main {

    public static void main(String[] args) {
        Car audi = new Audi("Audi", 400000);

        Car bmw = new Bmw("BMW", 4900);

        Car porsche = new Porsche("Porsche", 1800);

        Car[] cars = {audi, bmw, porsche};
        for (Car car1 : cars) {
            if (car1 instanceof Audi) {
                System.out.println(car1);
                ((Audi) car1).brake();
                car1.ride();
            }
            if (car1 instanceof Bmw) {
                System.out.println(car1);
                ((Bmw) car1).turn();
                car1.ride();
        }
            if (car1 instanceof Porsche) {
                System.out.println(car1);
                ((Porsche) car1).rideBack();
                car1.ride();
            }

        }

    }
}
