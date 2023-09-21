package examples;

// Unbounded Wildcards -> ?

// Lower Bounded Wildcard -> ? super

// Upper Bounded Wildcards -> ? extends

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // When working with generics a (?)
        // represents a wildcard (unknown type)
        // when working with wildcards you have
        // (upper wildcards, unbounded wildcards, and
        // lower bounded wildcards )

        //Upper Bounded Wildcards
        // says  that we can restrict
        // the types that go inside or relax
        // the restrictions on a variable

        //Lower Bounded Wildcards

        // is when you want to be specific on the data type
        // but as well include the (super) type
        // so instead of extends you want to say (super)


        // prints items in the list
        // Only supports objects
//       List<Object> list1 = Arrays.asList(1, 2);
//       List<Object> list1 = Arrays.asList("11", 2, new Date());
//       List<Double> list1 = Arrays.asList(1.9, 1.3);
       // Takes Integers
       List<Integer> list2 = Arrays.asList(1, 2);
       // Takes Number

        // Number is an abstract class
        // for us to use it, we would need to use a class
        // that extends it
       List<Number> list3 = Arrays.asList();
//       printNumbers(list1);
       printNumbers(list2);
       printNumbers(list3);

       // Double and Integer wrapper classes wouldn't work because they are
        // a child of number
        // the static method is saying rather each number or super class
        // so Double  and Integer  is not allowed
        // Number is a super class of integer


    }

    // static print method
    // list interface and object wrapper
    // class creates list

//    static void print(List<Object> list) {
    // Use (?) to create a wildcard to create a generic method

    // Upper Bounded wildcard (?)
    // the print method can take
    // anything that is a Number
    // list 1 & 3 would have to be changed
    // as list 2 uses Integers, the types that go in the method
    // are restricted

    // We are saying that this number print numbers can take
    // the specified class as well as any child's class
    static void printNumbers(List<? super Integer> list) {
        // functional programming

        // for loop
        // for the list print a line for each object
//        list.forEach(System.out::println);
        // printing the types of list
        list.forEach(e -> {
            // gets class and name for list
            System.out.println(e.getClass().getName());
            // represents element for each object
            System.out.println(e);
        });
    }
}
