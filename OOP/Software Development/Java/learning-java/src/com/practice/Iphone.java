// OOP

// Encapsulation
//means that the data of your classes should be hidden from the
//outside world, and should only be accessible through its own methods.





package com.practice;

// Template for creating many  Iphone's
// within this class we will define many properties, attributes, and behaviors
// that represent the Iphone ( price, make, model, water-resistant )
// Encapsulation allows you to hide specific information and control access to the internal state of the object
public class Iphone {

    // Encapsulation
    // hiding data from the outside world.
    // private is an important concept within classes
    // Iphone class properties defines attributes of an object
    // In this case properties would be (model, price, water-resistant)


    // Properties

    // the data in the class should only be accessible
    // through the methods of the class
    // the data below must be private, so that it's not accessible from the
    // outside world
    // You should always hide your data when it comes to your classes
    // never have public or no modifier
    // So in classes the data should always be private
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    //  Default Constructor
    // a constructor is given to a class by default
     public Iphone(){}

    // Iphone Constructor
    // Constructors are used to set initial values

    public Iphone(IphoneModel model,
                  double price,
                  boolean isWaterResistant) {
        // this keyword is used to refer to the current instance of the current class
        // this is appended to properties model, price, isWaterResistant
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    // Model Constructor
    // You can have as many constructors as you want
    // All constructors have to be unique ( can not be re-used )
    public Iphone(IphoneModel model){
        // You would  have to pass the actual values within the "this" method as parameters
        // this keyword allows ou to call out to other constructors and reuse other constructors
        this(model, 0.0, false);
        this.model = model;
    }

    // Model and Price Constructor
    // You can have as many constructors as you want
    // All constructors have to be unique ( can not be re-used )
    // "this" keyword is used to invoke constructors
    // invoke means to either call or use different instances or properties

    public Iphone(IphoneModel model, double price){
        // You would  have to pass the actual values within the "this" method as parameters
        // this keyword allows ou to call out to other constructors and reuse other constructors
        this(model, price, true);
        this.model = model;
        this.price = price;
    }

    // Behaviors are defined as the functionality of a given object based of the class.
    // Getter and Setter Methods (Encapsulation)
    // Behaviors below are define the actual object given a phone
    // You can request to kno what the current model, price, and water-resistance of an Iphone
    // You can also alter and change the price, model, and water-resistance of each Iphone
    // over time (utilizing get and set).
    // The "this" keyword is referring to the current instance of the current class
    // get and set values for the properties.

    // Methods
    // the methods below allows us to get the price, set the price, etc.
    // We can have full control of how we let the client or anyone
    //who is using this class access data.


    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {


        this.price = price;
    }

    public boolean getIsWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    // toString Method
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
