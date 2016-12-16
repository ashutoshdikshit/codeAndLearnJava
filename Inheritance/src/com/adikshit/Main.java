package com.adikshit;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 1, 1, "Animal");
        Dog dog = new Dog(1, 1, 1, 1, "bruno", 1, 1, 1, 1,
                "Furry");

        dog.move();
        animal.move();
    }
}
