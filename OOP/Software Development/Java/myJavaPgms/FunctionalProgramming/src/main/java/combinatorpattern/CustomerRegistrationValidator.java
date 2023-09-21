package combinatorpattern;

// Implementing Combinator Pattern

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function <Customer, ValidationResult> {

    // Functions

    static CustomerRegistrationValidator isEmailValid() {
        System.out.println("running email validation");
        return customer -> customer.getEmail().contains("@") ?
                // Add static import
                SUCCESS : EMAIL_NOT_VALID;
    };

    static CustomerRegistrationValidator isPhoneNumberValid () {
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                // Add static import
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult () {
        return customer ->
                Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                // Add static import
                SUCCESS : IS_NOT_AN_ADULT;
    }

    //default

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
           ValidationResult result = this.apply(customer);
           return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
