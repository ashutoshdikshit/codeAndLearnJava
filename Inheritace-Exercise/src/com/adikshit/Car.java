package com.adikshit;

/**
 * Created by adikshit on 11/24/16.
 */
public class Car extends vehicle {

    private int doors;
    private String style;
    private boolean isAutomatic;

    public Car(String category, int speed, String mode, String fuelType, int wheels, int doors, String style, boolean isAutomatic) {
        super(category, speed, mode, fuelType, wheels);
    }
}
