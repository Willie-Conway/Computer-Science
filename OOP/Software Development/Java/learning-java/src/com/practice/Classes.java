// Classes
// a class is a blueprint or template for anything you can think of
// in the real world in the terms of software.
// the class is like a machine that condemns the identical object

// toString
// is a given string representation of the object
// it identifies specified properties and their values.

// Enums
// enums is a class that allows you to represent a group of constants

// Creating an object base of a class
package com.practice;



public class Classes {

    public static void main(String[] args) {

        // You can utilize the exact same template for building another Iphone
        // Creates new Iphone object
        // Applying the arguments from the constructor
        // create new instance of class Iphone
        // Passing the initial values that we want
        // instead of using the setter methods for setting
        // the actual values
        // iphone7Plus is the actual instance or object
        // You can invoke the actual methods inside the object

        //Space
        System.out.println();

        // iphone7Plus
        Iphone iphone7Plus = new Iphone(
                IphoneModel.IPHONE_7_PLUS,
                150.00);

//        Iphone iphoneX = new Iphone(
//                IphoneModel.IPHONE_X,
//                1550.00);

        // get model String

        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getModel().getModelStr());

        // toString
        System.out.println(iphone7Plus);

        // Space
        System.out.println();

        // IPhoneX
        Iphone iphoneX = new Iphone(
                IphoneModel.IPHONE_X,
                1550.00);

        System.out.println(iphoneX.getModel());
        System.out.println(iphoneX.getModel().getModelStr());

        // toString
        System.out.println(iphoneX);

//        Iphone iphone7Plus = new Iphone(
//                "7+",
//                200.00,
//                false);

//        Iphone iphoneXMax = new Iphone();

        // Invoking the behaviors of the Iphone
        // get values are subject to strings and integers
        // is values are subject to boolean

//        // Space
//        System.out.println();
//
//        // iphoneXMax
//        System.out.println("iphoneXMax");
//        System.out.println();
//
//        // sets model value
//        System.out.println("x max");
//        iphoneXMax.setModel("X Max");
//        // sets price value
//        iphoneXMax.setPrice(1300.00);
//        // sets water-restraint value (true or false)
//        iphoneXMax.setWaterResistant(true);
//
//        // iphoneXMax
//        System.out.println(iphoneXMax.getModel());
//        System.out.println(iphoneXMax.getPrice());
//        System.out.println(iphoneXMax.isWaterResistant());

        // Space
        System.out.println();


        // iphone7Plus
//        System.out.println("iphone7Plus");
//        System.out.println();
//
        // sets model value
//        System.out.println("7+");
//        iphone7Plus.setModel("7+");
        // sets price value
//        iphone7Plus.setPrice(100.00);
        // sets water-restraint value (true or false)
//        iphone7Plus.setWaterResistant(false);

        // iphone7Plus
//        System.out.println(iphone7Plus.getModel());
//        System.out.println(iphone7Plus.getPrice());
//        System.out.println(iphone7Plus.isWaterResistant());

        // toString

      //  System.out.println(iphone7Plus);



    }
}



