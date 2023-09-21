package com.practice;

// Interfaces
// abstraction can be achieved with interfaces
// the benefits of  having an abstract class is that
// you can define some properties and behaviors
// you can get the name , you can set the name.
// Am abstract method is a method with no implementation

// Abstract class
 public interface AnimalInterface {


    // Abstract Method
    //  it does not  have any implementation
    // the children or classes extend the parent class to define the implementation

    // Abstract Method makeSound() is being overriding in Cat.java
    // Interfaces is just a class where you pretty much define
    // abstract methods that anyone that wishes to use this interface
    // must implement all the methods defined inside the interface
    // just abstract methods
    // with abstract classes you cn have abstract methods and normal methods

    // Abstract method makeSound()
    // Not Redundant
    void makeSound();

    // Normal method getName()
    String getName();




    }


