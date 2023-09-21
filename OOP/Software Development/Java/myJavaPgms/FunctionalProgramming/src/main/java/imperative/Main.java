
// Package
package imperative;

// Imperative Approach
/*
*  With imperative programming you are defining every
* single detail from an empty list and an if statement
* then finally a final for loop, looping through
* females.
*
*
* */

// Import List Class
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


// Import Imperatives (MALE, FEMALE)

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {

        // Create list called Person
        List<Person> people = List.of(
                // append every person on list
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)

        );
        System.out.println("//Imperative approach");

        // Imperative approach
        // list of females

        /*Logic*/

        List<Person> females = new ArrayList<>();

        // for loop
        for (Person person : people) {
            // If equal to a female add another person
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        // for loop for females
        for (Person female : females) {
            // Prints female
            System.out.println(female);
        }

        // Functional Programming

        System.out.println("//Declarative approach");

        // Declarative approach

        // filters a person through a stream and checks to see if
        // person is equal to gender of  female and
        // adds female to the collection list

        /*
        From the people arraylist, we're going to stream, then go into
        an abstract mode to filter all the females, collect to a list
        then print everything
        */

        // Predicate
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                // filters for person
                .filter(personPredicate)
                // collection list
                .collect(Collectors.toList());
                // for loop
                females2.forEach(System.out::println);




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
            MALE, FEMALE
        }

    }

