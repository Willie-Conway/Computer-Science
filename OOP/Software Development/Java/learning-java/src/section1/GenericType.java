package section1;

// Generic Type Naming Convention
// Type Parameter and Type Argument


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {
    public static void main(String[] args) {
        // The List<E> is specific type, for any placeholder
        // <E> is te naming convention that is used when working with generics
        // It just helps with understanding the code,
        // <E> -> Element
        // List<E> ->  placeholder = Type Parameter
        // <String> = Type Argument
        // that can take any data type
        // When you define type arguments, it means
        // your data structure class or interface can only work with
        //  the data type you have specified
        //  for instance, in string list, you can't say
        // -> names.add(1)
        // the list specified tells yu that you can only have
        // strings inside the list
        //  Otherwise you will get a compilation error
        // This is what generics help us with
        // you would have to use the double quotes to specify
        // 1 as a string ("1")


        // Creating a List of Strings
        List<String> names =
                // String List
                new ArrayList<>();
        names.add("");
        // Creating a List of numbers
        // <Integer> = Type Argument

        List<Integer> numbers =
                // Integer List
                // the list specified tells yu that you can only have
                // integers inside the list
                new ArrayList<>();
        numbers.add(1);

        // Create a Map
        // Map<K , V> -> <parameter 1, parameter 2> = arguments
        // <K, V> is the naming convention that is used when working with generics
        // It jut helps with understanding the code
        // <K, V> -> Key, Value

        Map<String, String> map =
                // Create a String HashMap
                new HashMap<>();

        // Create Map 2
        Map<Point, Double> map2 =
                // Create a String HashMap
                new HashMap<>();
        /*
        Naming Convention

        E – Element (used extensively by the
            Java Collections Framework, for
            example ArrayList, Set etc.)
        K – Key (Used in Map)
        N – Number
        T – Type
        V – Value (Used in Map)
        */



    }
}
