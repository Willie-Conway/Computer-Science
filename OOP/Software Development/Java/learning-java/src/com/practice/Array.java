// package is a series of classes.
package com.practice;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //Arrays
        int zero = 0;
        int ome =1;

        // Boolean Array
        // boolean [] numbers = new boolean[3];  // stores 3 boolean values within array (default)

        // Integer Array
        // Sizes of arrays are fixed and set.
         int [] numbers ={2, 0, 1, 4, 100};
        // String Array
         String [] names = {"Ali", "Maria"};

         /* Set Arrays*/

         //int [] numbers = new int[3]; // stores 3 int values within array (default)
        // Int array sequence variable number and stores placed values from index 0.
        // numbers[0] = 2;
        // numbers [1] = 0;
        // numbers [2] = 1;
         //numbers [3] = 24; // error message


        // String
        // String [] numbers = new String[3]; // // stores 3 String values within array (default)

        /*
        System prints line to define behavior Array class
        to string method (int), to define to variable numbers.
        */

        System.out.println(Arrays.toString(numbers));

        /*
        System prints line to define behavior to get array length, for
        the variable numbers.
        */
        System.out.println(numbers.length);

        /*
        System prints line to define behavior Array class
        to string method (String), to define to variable names.
        */

        System.out.println(Arrays.toString(names));

        /*
        System prints line to define behavior to get array length, for
        the variable numbers.
        */

        System.out.println(names.length);




    }
}
/*
Output:

[2, 0, 1, 4, 100]
5
[Ali, Maria]
2
*/
