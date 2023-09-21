package streams;

// Intro to Streams

// More on Streams




import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {

        // Create list called Person
        List<Person> people = List.of(
                // append every person on list
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Alex", FEMALE),
                new Person("Alice", MALE)
//                new Person("Bob", PREFER_NOT_TO_SAY)

        );



        // Stream the people list
        // perform different transitions

        // Function takes a person and returns a  String
        // Function takes a String and return an Integer
        //  takes a Consumer and prints out the results

        //        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;

        // extract variable

//        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
//                .allMatch(personPredicate);
//                .anyMatch(personPredicate);
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);





////                .map(person -> person.gender)
//                .map(person -> person.name)
//                // method reference
//                .mapToInt(String::length)
////                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        // Only has females list
        people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
            



    }



    // Person class

    static class Person {

        // Properties
        private final String name;
        private final Gender gender;

        // Constructor

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        // toString

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    // Enum

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
