// Package
package functionalinterface;

// BiFunction
// is the same as a function but instead that takes two inputs instead of one input
// and produces one output


// function class
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Properties

        // increment value (1)

        // Function takes one argument and produces 1 result


        int increment = incrementByOne(1);
        System.out.println(increment);


        // increment value (1)

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // multiply By (10)

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        // chaining functions
        // (4 + 1 * 10 )

        // functional programming

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction takes 2 argument and produces 1 result
        // (4 + 1 * 100)
        // Using normal Java function
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        // BiFunction
        // Using the BiFunction

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );



    }


    // Function
    /*
    The <Integer>  corresponds to (int number), the static (int increment )
    corresponds to the return type, the number -> corresponds to (number)
    parameter, and it's saying to take (0), then increment the number value by 1.
     */

    // functional programming

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number +1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;


    // takes an input and returns one single output
    // takes int number and returns the number that's
    // being incremented

    static int incrementByOne(int number) {
        return number + 1;
    }

    // BiFunction

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // BiFunction

    // functional programming

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
