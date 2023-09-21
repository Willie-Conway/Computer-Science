package functionalinterface;

// Predicate

/*
The cool thing about predicates
is that you can have a bunch of
predicates and combine them together
*/

// conditions : or, and

// Predicate Class

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        // Print PhoneNumbers (Validation Check)
        System.out.println("Without predicate");

        System.out.println(isPhoneNumberValid("07000000000"));

        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println(isPhoneNumberValid("0900987730"));

        System.out.println("With predicate");

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));
        System.out.println(isPhoneNumberValidPredicate.test("0900987730"));

        // chain predicate

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003")
        );


    }
    // Boolean method
    // normal java function
    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    }

    // Predicate
    // functional programming
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
