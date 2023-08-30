/******************************************
 * 
 * Willie Conway
 * CWUnit7.java
 * 
 * Enter house info, print House info.
 * house in.... house out
 * ****************************************/

import java.io.File;
import java.util.Scanner;

public class CWUnit7
{
  public static void main (String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    Scanner stdInFile;
    try {
    stdInFile = new Scanner(new
        File("CWUnit7House.txt"));
    }
    catch (Exception e) {
      System.out.println ("Unable to open file");
      return;
    }
    CWUnit7House house1, house2; //New houses

    //Create house 1 using default constructor
    house1 = new CWUnit7House();
    house1.print(); //print house 1 with default values

    String street, city, state, zipCode;
    int number;

    System.out.println("Importing Number.");
    number = stdInFile.nextInt();
    stdInFile.nextLine();
    System.out.println("Importing Street.");
    street = stdInFile.nextLine();
    System.out.println("Importing City.");
    city = stdInFile.nextLine();
    System.out.println("Importing State.");
    state = stdInFile.nextLine();
    System.out.println("Importing ZipCode.");
    zipCode = stdInFile.nextLine();
    System.out.println();

    //use method call chaining to set values
    //and print results for house 1
    house1.setNumber(number).setStreet(street)
    .setCity(city).setState(state)
    .setZipCode(zipCode).print();

    System.out.println("Importing Number.");
    number = stdInFile.nextInt();
    stdInFile.nextLine();
    System.out.println("Importing Street.");
    street = stdInFile.nextLine();
    System.out.println("Importing City.");
    city = stdInFile.nextLine();
    System.out.println("Importing State.");
    state = stdInFile.nextLine();
    System.out.println("Importing ZipCode.");
    zipCode = stdInFile.nextLine();
    System.out.println();

    //create house 2 using 5 parameter constructor
    house2 = new CWUnit7House(number,
    street, city, state, zipCode);

    //print house 2
    house2.print();

  }
}
