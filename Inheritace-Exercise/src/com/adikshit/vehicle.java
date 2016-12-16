package com.adikshit;

/**
 * Created by adikshit on 11/24/16.
 */
public class vehicle {
    public vehicle(String category, int speed, String mode, String fuelType, int wheels) {
        this.category = category;
        this.speed = speed;
        this.mode = mode;
        this.fuelType = fuelType;
        this.wheels = wheels;
    }

    public void move() {
        System.out.println(this.category + " is moving");
    }

    public String getCategory() {
        return category;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMode() {
        return mode;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getWheels() {
        return wheels;
    }

    private String category;
    private int speed;
    private String mode;
    private String fuelType;
    private int wheels;




}
