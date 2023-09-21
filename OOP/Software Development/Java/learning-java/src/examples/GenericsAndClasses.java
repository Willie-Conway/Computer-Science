package examples;

// Main method class

import java.util.Date;

public class GenericsAndClasses {

    public static void main(String[] args) {
        // Create new box object from Box class
        // add phone as a wrapper for the box class
        Box<Phone> box = new Box<>();

        // Not forcing any type <T> for the box
        // the reason for forcing a type parameter
        // is to specify the elements in the box

        // set new phone from phone class

        box.setT(new Phone("Samsung"));

        // prints what's inside the box

        System.out.println(box.getT());

        // Add the Letter
        // Create box2 from box class
        // wrapped with phone class
        Box<Letter> box2 = new Box<>();
        box2.setT(new Letter("Amigoscode"));
        System.out.println(box2.getT());


        // Causes compilation error

//        // set box string
//        box.setT("1");
//        // set box number
//        box.setT(1);
//        // set a new date
//        box.setT(new Date());

    }

}
