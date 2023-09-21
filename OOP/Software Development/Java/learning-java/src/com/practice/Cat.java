package com.practice;

public class Cat implements AnimalInterface {

    // Properties
    private String name;

    // Constructor
    public Cat(String name) {
        this.name = name;

    }

    // Abstract Method

    //  it does not  have any implementation
    // the children or classes extend the parent class to define the implementation
    // the  keyword @Override refers to overriding the makeSound() method
    // this is commonly used for  documentation purposes.
    // this helps us in knowing that we are overriding
    // the behavior that's set in the Animal class.


    // Overriding a Method
    @Override
    public void makeSound() {
        System.out.println("miaow miaow");

    }

    @Override
    public String getName() {
        return this.name;
    }
}
