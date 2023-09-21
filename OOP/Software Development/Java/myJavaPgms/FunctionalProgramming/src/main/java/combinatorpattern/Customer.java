package combinatorpattern;

// Validation Service Example

// a system where customers register to your system, and you need to
// perform some kind of validation

import java.time.LocalDate;

public class Customer {

    // Properties
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    // Constructor

    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
