package com.practice;

// Inheritance
// is a process where an object requires all
// the properties and behaviors of a parent object


// Abstraction
// is the process of hiding certain details and showing
// essential details to our users



// Abstraction can be achieved by
// the use of interfaces or abstract classes


// Polymorphism
// mean many forms.
// is line 40 and 41.
// is line 48 and 49.


// Interfaces
// abstraction can be achieved with interfaces
// the benefits of  having an abstract class is that
// you can define some properties and behaviors.

// Method Overloading
// is another way of achieving polymorphism in many forms

// Intro to Available Date classes
// Working with date and time

// Available Zones
// working with available zones, date, and time

//Exploring Date available methods

// The problem with double and Double

// The Big Decimal

// Comparing BigDecimals

// there's tons of methods for the big decimal class

// The Null value

// Handling Null value
// (NullPointerException)

// the try - catch exceptions are sort of expensive
//  and this because of the internal to do with the
//  jvm to do with a stack, however try to avoid using
//  try-catch blocks to deal with null values

// Intro to Optionals

// Optionals are container objects that hold non-null and empty
// values

// Professional way of handling null values with java

// Intro to Exceptions

// Errors happen all the time in the real-world. It may be invalid user input
// or external system that's not responding. Or simply
// any programming error. These errors happen at runtime
// and the program needs to be able to handle the errors
// so that the program can continue running and not crash.

// Runtime (JRE)

// Runtime is important  because if errors are found in the code
// the program will  throw runtime errors.

/*
JDK <-----> Java Development Kit <-----> Compile Time <----> (javac)

JVM <-----> Java Virtual Machine <-----> Source Code <----> Execute programs <---> (manages system memory)

JRE <-----> Java Runtime Environment <-----> RunTime <----> (computation)

*/

// Checked Exceptions

//  are exceptions that need to be handled at compiled
// time. which means if a method is throwing a checked exception
// we should handle that exception using a try-catch block or
// using the throw's keyword. The program will give you a compilation error

// Unchecked Exceptions

// are exceptions that are not checked at compile time.
// this means the program is throwing an unchecked exception
// and even if you don't handle the exception, the program won't
// give you a compilation error


// try Catch and Finally

// Try keyword just says anything you define anything the
// curly brackets, if it breaks then we will catch it

// catch keyword catches the exception type that's expected
// if you do not know the exception type then you can use
// exception

// throws keyword
// declares an exception. It gives information that an exception may occur.

// the finally keyword does execute regardless of whatever. So
// is used for clean up purposes.

// rather it's your logic or anything or after the try,
// rather it works or not you want the logic in the finally block
// to be executed

// Creating Files

// In this section we will learn how to work with  files
// how to create files, how to read files, and how to write to
// files
// there are many ways to work with files.

// Writing to files using PrintWriter

// now that we have a file lets go ahead and write to it
// in order to write to a file you need to use PrintWriter class
// PrintWriter is one of many ways to write to a file, and you'll
// see a lot of methods and ways to write to a file

// Everytime you run a PrintWriter and FileWriter you
// are overriding the contents inside the file
// what you want to do is essentially override each time,
// but it's good to know that you can append


// Reading files

// to read from your file, you need to ue the BufferReader class

// Parsing Files

// rationally parse a csv file ( comma-separated value)

// you can add this logic to a database
// you can add some logic for manipulation
// you now know how to manipulate files with java







// File class
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
        // Creating new file object
        // pathname : src/ data.csv
        // extension: data.csv
        // source folder / comma-separated value

        // Extract file name to variable
        String filename = "src/data.csv";

        // creates new instance of a file
        File file = new File(filename);

        // If statement
        // checks to see if file does not (!) exists
        if (!file.exists()) {
            // Try and catch block
            try {

                // create new file
                file.createNewFile();
                // gets name of file created
                System.out.println(file.getName() + " created");
                // catch IOException is thrown when you work with files
                // it's  checked exception type  when you input / output
            } catch (IOException e) {
                // Prints message after catching IOException
                System.out.println("Error creating file");
                System.out.println(e);

            }

        }

        // Writing to a file

        // Use PrintWriter class  to write to a file

        // Try catch block
        try {
            // creates FileWriter and pass in filename
            FileWriter fileWriter = new FileWriter(filename);

            // appending to a file
//            FileWriter fileWriter = new FileWriter(filename, true);
            // creates PrintWriter and pass in fileWriter
            PrintWriter printWriter =
                    new PrintWriter(fileWriter);
            // printWriter prints "hello"
            // overrides contents of file everytime program
            // is run
            // we have the ability to append to our file
            printWriter.println("id,name,email");
            printWriter.println("1,Jamila,jamaila@gmail.com");
            printWriter.println("2,Alex,alex@hotmail.com");
            printWriter.println("3,Musa,musa@hotmail.com");
            printWriter.println("4,Ahmed,ahmed@yahoo.com");
            // closes printWriter
            printWriter.close();
            // flushes printWriter
            printWriter.flush();
            // contents
            System.out.println("contents added to file");

        } catch (IOException e) {
            System.out.println(e);
        }

        // Reading files

        // Try-catch block
        try {

            // This is just one way of reading from files

            // Creates FileReader and passes in file
            FileReader fileReader =
                    new FileReader(file);
            // Creates BufferReader and pass in fileReader
            BufferedReader reader =
                    new BufferedReader(fileReader);

            // contents
            String line = "";


            // Skips the first line of the file
            System.out.println("header = "
                    + reader.readLine());

            // Adding users to a List
            // Create an Arraylist
            List<User> users = new ArrayList<>();

            // looping through the contents of the file
            // and printing to the console
            while ((line = reader.readLine()) != null) {
//                System.out.println(contents);

                // Splitting Contents
                // using (,) to split contents
                String[] split = line.split(",");

                // Properties fields for split
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];

               // User Email
                User user = new User(id, name, email );

                //Add a user
                users.add(user);

            }

            // closes reader
            reader.close();

            // functional programming
            // for Each user loop
            System.out.println("Looping through users list");
            users.forEach(System.out::println);


        } catch (IOException e){
            System.out.println(e);

        }
        // Reading files

        // Using BufferReader to read files

//        BufferedReader reader =
//                // Creates BufferReader and pass in FileReader that passes in file
//                new BufferedReader(new FileReader(file));
//        // FileWriter has an unhandled exception
//        FileWriter fileWriter = new FileWriter(filename);
//        PrintWriter writer = new PrintWriter()


//        // Try and catch block
//        try {
//
//            file.createNewFile();
//            // catch IOException is thrown when you work with files
//            // it's  checked exception type  when you input / output
//        } catch (IOException e) {
//            System.out.println("Error creating file");
//            System.out.println(e);



    }
}


