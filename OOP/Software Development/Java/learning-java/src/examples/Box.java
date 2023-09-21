package examples;

// Generic and Classes

// Generic and Classes Part 2

// The syntax for generics when your working with classes,
// is that you add the diamond to the class name <>

// <T> -> Type
// this box takes any type (integer, string, boolean, long, short, byte, float, double, custom )
// literally anything any data type

public class Box<T> {
    // You can have as many of these as you want
    // Just ake sure your using the right convention
//public class Box<T, K, P, C> {

    // private variable
    // what we are saying is that
    // T is the actual name of tha variable

    private T t;
//    private K k;

    // method that lets us set the name
    // of the contents that's in the actual box


    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
