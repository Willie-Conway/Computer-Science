package com.practice;

// extends keyword is used to inherit parent class Animal
// with abstract interfaces you can only extend one class
// in java you can only extend one class
public class Dog implements AnimalInterface {

    // Properties
    private String breed;
    private String name;

    // Constructor
    // This Dog can have its own properties
    public Dog(String name, String breed) {

        // super means this variable name will be passed
        // in side of our super class which is Animal
        // so there's no reason to use this keyword as the
        // constructor in the animal class is defining the animal

        this.breed = breed;
    }

    // Getter and Setter

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Abstract method


    // Overriding a Method
    @Override
    public void makeSound() {
        System.out.println("woof woof");

    }

    // Overriding a Method

    @Override
    public String getName() {
        return this.name;
    }
}
