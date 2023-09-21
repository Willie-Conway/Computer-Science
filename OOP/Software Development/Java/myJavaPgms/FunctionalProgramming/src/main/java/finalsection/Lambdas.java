package finalsection;

// Primitives



import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;
        // functional programming
        // lambda -> (argument)
        // this name comes from the data type
        // only when you have one uppercase statement or line that return immediately
//        Function<String, String> upperCaseName = name -> name.toUpperCase();
        // when you use functional interfaces,  where you define inputs and outputs
        // of functions. There has to be an object type and not the primitive
        // not allowed to have primitives in the wrapper
      BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
//        Function<String, String> upperCaseName = name -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };


        System.out.println(upperCaseName.apply("Alex", 20));
    }

    class Service {
         Consumer<String> blah = s ->{

        };
    }

    // the oly time you can use static is when you're outside the
    // main function
    // if static is removed the code in the
    // main function will cause an error

//    static BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
////        Function<String, String> upperCaseName = name -> {
//        // logic
//        if (name.isBlank()) throw new IllegalArgumentException("");
//        System.out.println(age);
//        return name.toUpperCase();
}
