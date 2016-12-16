package com.adikshit;

public class Main {

    public static void main(String[] args) {
        vehicle newVehicle = new vehicle("4Wheeler", 60, "ground", "Gasoline", 4);
        Car newCar = new Car("4Wheeler", 60, "ground", "Gasoline", 4, 4,
                "Coupe", false);
        Porsche cayane = new Porsche("4Wheeler", 60, "ground", "Gasoline", 4, 4,
                "Coupe", false, "911", "Red");

        cayane.move();
    }
}
