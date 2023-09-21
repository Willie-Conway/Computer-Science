package combinatorpattern;

// Validation Service Example

// combinator pattern is awesome design pattern that allows you
// to chain functions together. A combinator pattern is a
//  function that might take all the functions as an argument
// and might return new functions.

import java.time.LocalDate;
import java.time.Month;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));


        // if valid we can store customer in db

        // Using combinator pattern
        // chained
        // Add static import
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
               .apply(customer);
        System.out.println(result);

        // If statement

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());

        }
    }
}
