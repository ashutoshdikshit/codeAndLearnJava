package com.adikshit;

/**
 * Created by adikshit on 11/24/16.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain, int body, int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(brain, 1, 1, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void move() {
        System.out.println("this is from DOG" + this.getName());
        super.move();
    }
}
