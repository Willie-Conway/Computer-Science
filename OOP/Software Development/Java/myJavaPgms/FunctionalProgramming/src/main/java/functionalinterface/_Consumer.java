package functionalinterface;

// BiConsumer

/*
represents an operation  that accepts
a two input arguments instead of one and returns no
result
*/

import java.lang.reflect.Constructor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Consumer class
public class _Consumer {
    public static void main(String[] args) {

        //Functions

        // Creates new customer from customer class
        // Pass in new customer and greets customer
        // Normal java function

        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        // Consumer Functional interface


        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, false);

    }

    // functional programming
    // BiConsumer

    /*
    A Consumer takes one argument and returns nothing. The (Customer)
    is the data type of the input, the (customer) is the name of the input.
    (void) is a consumer. (void) is a return type, tht just specifies the method doesn't
    return anything. Soon as the method terminates , the code block terminates.
    */

    static Consumer<Customer> greetCustomerConsumer = customer ->
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);

    // BiConsumer

    // Boolean will determine if we should hide the customer
    // from the PhoneNumber
    // always enclose two or more arguments with parenthesis


    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ?  customer.customerPhoneNumber : "**********"));

    // Greeting Customer

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);

    }

    // BiConsumer

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + (showPhoneNumber ?  customer.customerPhoneNumber : "**********"));

    }

    // Customer Properties

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        // Constructor

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
