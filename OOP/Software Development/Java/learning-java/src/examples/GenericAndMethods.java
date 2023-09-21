package examples;

// Generics and Methods

public class GenericAndMethods {
    public static void main(String[] args) {
        // pass an array of names
        String[] names = {"Ali", "Jamila"};
        Character[] letters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 3, 4, 5, 5};
                // print array
        // this method cna pass integers
        // Generics doesn't accept int, double, and char
        // has to be wrapper class (object version)
        // characters or literally any datatype
        print(names);
        // To use generics with methods is very similar to using
        // generics with classes
        // With generics , you can not
        // use the lowercase version of a primitive (char)
        // should be (Character)

        print(letters);

        print(numbers);

    }
    // Creating a method
    // return typ is void
    // however the return type can be the actual type you want
    // You can say (T) for example and the program will still execute
    // it's just at the end you need to return the datatype


    static <T> void print(T[] array) {

        // for loop
        // String variable e is a string array
        // no longer String and the datatype is <T>
        for (T e : array) {
            // get class name / print class name
            System.out.println(
                    e.getClass().getName()
                            + " - " + e
            );
        }
    }

}
