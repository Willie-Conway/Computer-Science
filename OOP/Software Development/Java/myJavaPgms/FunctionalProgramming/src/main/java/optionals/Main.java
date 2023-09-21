package optionals;

// Optionals

// will help you a lot of dealing with null pointer exceptions

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Functional Programming

        // Optional

        // Supplier

        // takes no arguments but supplies a value

//        Supplier<IllegalStateException> exception = ()
//                -> new IllegalStateException("exception");

          Optional.ofNullable(null)
                  // Pass a runnable () -> {}
                  .ifPresentOrElse(email ->System.out.println("Sending email to " + email),
                          () -> {
                              System.out.println("Cannot send email ");

                  });
//        Object value = Optional.ofNullable("Hello")
//        Optional.ofNullable("John@gmail.com")
                // suppliers
//                .orElseGet(() -> "default value");

//                .orElseThrow(exception);

                // logic
//                .ifPresent(email ->System.out.println("Sending email to " + email));




    }
}


