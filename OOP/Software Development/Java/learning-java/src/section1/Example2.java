package section1;
// Generics
// ClassCastException

public class Example2 {
    public static void main(String[] args) {
        // Comparable
        // ClassCastException error appears
        // the use of generics will help catch this error by being
        // executed at compile time and not runtime
        // this is because we know we can't really compare an
        // integer to a string

//        // Integer (10)
//        Comparable number = 10;
//        // compareTo method
//
//        // String (10)
//
//        number.compareTo("10");

        // Integer (10)
        // If you try to add (10) it will imply that you
        // change variable number to comparable string
        // Generics provide compile time checking
        // and removes the risk of ClassCastException

        // Compare only Integers
        Comparable<Integer> number = 10;
        // compareTo method

        // String (10)

//        number.compareTo("10");
        System.out.println(number.compareTo(11));

    }
}
