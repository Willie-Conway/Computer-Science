package com.practice;

// Interfaces
// abstraction can be achieved with interfaces
// the benefits of  having an abstract class is that
// you can define some properties and behaviors
// you can get the name , you can set the name.
// Am abstract method is a method with no implementation

// Abstract class
abstract public class Animal {

    // Properties
    private String name;

    // Constructor

    public Animal(String name) {
        this.name = name;
    }

    // Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract Method
    //  it does not  have any implementation
    // the children or classes extend the parent class to define the implementation

    // Abstract Method makeSound() is being overriding in Cat.java

    public abstract void makeSound();

    // toString
    // the toString method is being overriding
    // the way we have a string representation of an object
    // is overriding the toString

    // Overriding a method
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
