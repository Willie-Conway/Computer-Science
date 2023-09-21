package examples;

// Bounded Type Parameters
// Multiple Bounds

public class BoundedTypeParameter {
    public static void main(String[] args) {
        // int array
        // whole numbers
//        int[] numbers = {1, 2, 3};
        // Object class Integer
        Integer[] numbers = {1, 2, 3};
        // this wouldn't work because the double are decimal number
//        double[] numbers = {1.0, 2.0, 3.0};
        // countGreaterThan method
        countGreaterThan(numbers,0);
        // print numbers greater than 0
        System.out.println(
                countGreaterThan(numbers,0));

        // Generic method using double
        // this is no longer the case because double and integer
        // don't implement the interface

        Double[] numbers2 = {1.0, 2.0, 3.8};
        System.out.println(
                countGreaterThan(numbers2,0.9));



    }

    // method to count how many number are bigger than
    // the int value
    // create generic method to be return by using <T>
    // <T>  -> data type
    // Bounded type parameters is a way of creating more generic
    // algorithms, it assures a way for us to be  more restricted
    // on the types we want our methods to work with
    // make sure the method displays to work with numbers

    // allows for static method to take any data type
    // and inherit the comparable datatype for the
    // int countGreaterThan method
    // Comparable <T> and anything that extends the comparable
    // interface

    // you can use bounded type parameters with classes as well as
    // methods

    // There re times when you want to enforce multiple bounds
    // on these bounded parameters
    // maybe you want to extend the comparable interface
    // or the actual argument that comes in has to be anything
    // that actually extends comparable interface as well as implementing one
    // or more methods

    // multiple bounded types

    interface A {}
    interface B {}

    // what ever method tht gets passed in haas to extend
    // the comparable interface but also implement A
    // so every argument  that we pass in has to
    // satisfy everything that we have wrapped in the static method

    // When using extends nd you have a mix of classes and interfaces
    // if you only have one class or interface  everything is fine
    // don't use implement use extends
    // one thing to remember is that the class can not
    // be anywhere from the first position
    // for instance (Number) can't be placed anywhere else
    // from the beginning, it can't be at the end
    // classes should come first, then interfaces
    // also you can not extend multiple classes
    // In java you can only extend one class
    // either one class on its own
    // or one class and multiple interfaces
    // or just interfaces



//    static<T extends Number & Comparable<T> & A & B> int countGreaterThan(T[] numbers,
    // bounded type parameters allows us to capture
// the parameters that go inside our methods and classes

    // can't reference a type your capturing in a wildcard
    static<T extends Comparable<T>> int countGreaterThan(T[] numbers,
                               T number) {
        // properties
        int count = 0;

        // for loop
        for (T n: numbers){
            // if statement
            // you can create an if statement with numbers
            // using double and floats, any number

            // takes the number and compares it to the
            // countGreaterThan method number 0

            if (n.compareTo(number) > 0) {
                // if the number is greater than the current number (0)
                // we want to increment the value
                count++;


            }
            // returns the actual count of numbers
        } return count;
    }


}
