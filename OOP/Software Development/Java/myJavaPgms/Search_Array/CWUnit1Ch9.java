/**************************************************************************************
* CWUnit1Ch9.java
* Willie Conway
*
*
*
*
*
* This program gets, creates, sorts, prints and searches an array of random numbers
* The following perameters are followed:
*
* Declare an array size of 10
* Fill each element of the array with random numbers (1-20)
* Copy this array for assortment using java API
* Prints both arrays in tablular format
* Allows a user to input a number to search
* Using a "for-each" loop the program searches both arrays and prints out the location
***************************************************************************************/


import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class CWUnit1Ch9 { //start class

	public static void main(String[] args) { //start main

	Scanner stdIn = new Scanner(System.in);
	int[] unsortedArray = new int[10]; // array declared with size of 10
	int[] sortedArray = new int[10]; // second array for copy of first array
	Random number = new Random(); // generates random integer


//***************************************************************************************************************
// Fill each array element with a random number 1-20
// Make a copy of the array for sorting
// Sort the copied array using java API
// Print a table showing both the unsorted and sorted arrays


	for(int i = 0; i < 10; i++)
	{
	   unsortedArray[i] = number.nextInt(20) + 1;
	}


	for(int i = 0; i < 10; i++)
	{
	   sortedArray[i] = unsortedArray[i];
	}

	Arrays.sort(sortedArray); //sort "sorted" array via java API

	System.out.println("Unsorted Array\tSorted Array");


	for(int i = 0; i < 10; i++)
	{
		System.out.println(unsortedArray[i] + "\t" + "\t" + sortedArray[i]);
	}


//****************************************************************************************************************
// Search for a user inputted number. If the number is found, return the number and position within each array
// If number was not found, prompts user that the number was not found


	System.out.print("\nPlease enter a number to search for: ");
	Scanner scan = new Scanner(System.in); //allows user input to search for a specific number
	int num = scan.nextInt();
	int location1 = -1;



	for(int i = 0; i < 10; i++){
		if(unsortedArray[i] == num){
			location1 = i;
				System.out.println("\nSearch Value: " + num + " is found at location: " + (location1 + 1) +" in the unsorted array");
		}

		if(sortedArray[i] == num){
			location1 = i;
				System.out.println("\nSearch Value: " + num + " is found at location: " + (location1 + 1) +" in the sorted array");
		}
	}


	if(location1 == -1){
	System.out.println("\nSearch Value: " + num + " was not found");
	}



	} //end main

} //end class