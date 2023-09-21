package section1;

// Generics
// Compile time checking

import java.util.ArrayList;
import java.util.List;

// Understanding ClassCastException
public class Example {
    public static void main(String[] args) {
        // Creates new List numbers
        // List needs to be defined as Integer, String
        // or Integer / String
        List<Integer> numbers = new ArrayList();

        // add to  numbers list



        // Generics is used to help enforce the type on the list
        // this is what generics give us, we don't know
        // if the following contents added to the list will give
        // us an error until we run the program.
        // we want to catch the errors at runtime
        // and not compile time


        // Integer (primitive)

        numbers.add(1);

        // String (non-primitive)
      //  numbers.add("2");

        // for loop
        // functional programming
        // Object class

        for( Object number : numbers) {

            // Prints numbers that were added to
            // the numbers list
//            System.out.println(number);

            // casting the number object to a string
            // can also cast it to an integer
            // An ClassCastException error occurs because
            // in the numbers list your trying to cast a primitive
            // to a string and that will not work.

           // System.out.println((String) number);
            System.out.println((Integer) number);


        }

    }
}
