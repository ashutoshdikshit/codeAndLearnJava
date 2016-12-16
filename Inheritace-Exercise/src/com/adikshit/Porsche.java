package com.adikshit;

/**
 * Created by adikshit on 11/24/16.
 */
public class Porsche extends Car {
    private String model;
    private String color;

    public Porsche(String category, int speed, String mode, String fuelType, int wheels, int doors, String style,
                   boolean isAutomatic, String model, String color) {
        super(category, speed, mode, fuelType, wheels, doors, style, isAutomatic);
    }
}
