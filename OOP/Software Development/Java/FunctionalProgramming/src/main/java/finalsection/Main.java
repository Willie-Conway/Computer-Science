package finalsection;

// Callbacks like JS

/*
CallBack Function is a function that is passed
into another function as an argument and is expected
to execute after some kind of event.
 */

/*
This provides broth worlds, where you cn mix and combine functional
interfaces with normal functions and have callbacks
 */





import java.util.function.Consumer;

public class Main {
    // main method
    public static void main(String[] args) {

        // regular java method

//        hello("John", "Montana", null);

        // functional programming

        // If value is null block of dode will execute the print statement

        // pass in a default value

        // hello

        hello("John", "Montana", value -> {
            System.out.println("no lastName provide for " + value);
        });

        // hello2

        hello2("John",
                null,
                () -> System.out.println("no lastname provided for"));


    }
    // functional programming
    // Regular java method

    // Function

    // you can combine a normal function with the functional interfaces
    // with functional programming and achieve  similar concept called
    // callbacks, also used in JavaScript


    static void hello(String firstName, String lastName, Consumer<String> callback) {

        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);

        } else {
            callback.accept(firstName);
        }
    }

    // Runnable callback () ->
    static void hello2(String firstName, String lastName, Runnable callback) {

        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);

        } else {
            callback.run();
        }

//    // paste function in  Google Chrome
//    // Console programming
//
//    function hello  (firstName, lastName, callback) {
//        console.log(firstName);
//        if (lastName) {
//            console.log(lastName)
//        } else {
//            callback();
//        }
//
//        hello("John", null, function() {console.log("no lastName provided")})
//        hello("John", "Montana", function() {console.log("no lastName provided")})

    }
}




// John
// no lastName provided