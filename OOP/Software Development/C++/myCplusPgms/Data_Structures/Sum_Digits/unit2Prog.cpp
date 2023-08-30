/***********************************************************************************
* File: unit2Prog.cpp
* Willie Conway
* CS352 Data Structures
*
* This program asks for input of nonnegative intergers. Uses pass-by-reference to
* pass interger receive into a recursive funtion called sumDigits. Receives result
* back from sumDigits and outputs results to screen. Recursivley calls sumDigits
* adding up intergers received, then returns result to main method for output. Uses a 
* while loop and gives user a Yes or No option to continue or close program.
***********************************************************************************/


// accesses new I/O stream classes
#include <iostream>
// includes features of the C++ Standard Library
using namespace std;

//Declaring global variables
int sum = 0;
int number = 1;

//Function declaration
int sumDigits(int num);


// Calculates the sum of digits of the given number.
int sumDigits(int num)
{

	//Checks whether the user entered number is 0 or not. If it is zero the retun 0 as sum.
	if (num == 0)
	{
		return sum;
	}
	
	//Returns the same number to main method when user enters single digits.
	else if (number == 1 && num < 10)
	{
		return num;
	}
	else
	{

		number = 2;

		//Adding digits of the number
		sum += num % 10;

		//Calling the function recursively.
		sumDigits(num / 10);

	}

	return sum;

}

int main() // main function
{
	//Declaring variables
	int number, total;
	char ch;

	// Uses a while loop to continue to execute until the user enters 'N' or 'n'
	while (true)
	{
		//Prompts user to enter a non-negative interger
		cout << "Enter a nonnegative integer :";
		cin >> number;

		// Calling the function by passing the number as a argument
		total = sumDigits(number);

		// Outputs the sum of the digits of non-negative interger or results to screen
		cout << "The sum of the digits of " << number << " is " << total << endl;
		// Gives user the option to continue or quit program
		cout << "\nWould you like to continue(Y/N):";
		cin >> ch;


		// Checking to see if the user enter 'Y' or 'y'
		if (ch == 'y' || ch == 'Y') 
		{
			sum = 0;
			number = 1;
			continue;

		}
		else
		{
			cout << " Thank You." << endl;
			break;
		}
	}

	system("PAUSE"); // Pauses the screen

	return 0;
}