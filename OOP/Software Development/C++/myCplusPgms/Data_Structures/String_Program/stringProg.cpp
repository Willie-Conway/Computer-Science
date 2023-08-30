/***********************************************************************************
* File: stringProg.cpp
* Willie Conway
* CS352 Data Structures
*
* This program declarles a string called myString and uses Call-by-Reference to pass
* myString to a method called inputData() and uses Call-by-value to pass newName to 
* a method called outputData(). Prompts user to enter their Full name by Last, First 
* MiddileIntial and tests the data using a while loop to make sure the user enter 
* the format correctly.
***********************************************************************************/

// accesses new I/O stream classes
#include <iostream>
// new string class
#include <string>
// includes features of the C++ Standard Library
using namespace std;

void inputData(string &myString);
void outputData(string newName);

int main() // main function
{
	string myString;
	inputData(myString);

	outputData(myString);

	cout << endl << endl;

	return 0;
} // ends main method

//function used to input Data using calling by reference (&)
void inputData(string &myString)
{
	//prompts user to enter their full name: Last,First, MiddleInital
	cout << "Please use the following format to enter your full name:\n Last, First MiddleInital\n" << endl;
	getline(cin, myString);

	int first, last, middle;
	int comma, secondComma, totalLength;

	// as seen in text (Ford & Topp, pg. 32).
	comma = myString.find(","); // use this to make sure comma is equal to secondcomma since there can only be one comma
	secondComma = myString.rfind(","); // to compare with comma
	totalLength = myString.length(); // gets overall length
	first = myString.find(' ');
	middle = myString.find(' ', first + 1);
	last = myString.find(' ', middle + 1);

	// uses while loop to test if data is inputted correctly and generate error message if not.
	while ((comma == -1) || (comma != secondComma) || ((secondComma + 2) >=
		middle) || (first == 0) || (last != -1))
	{
		cout << "\n\nError: Please follow the correct format and only place a comma in-between Last and First name!!! \n" << endl;
		cout << "Try again: \n\n Please enter your full name in the following format:\nLast, First MiddleIntial\n" << endl;
		getline(cin, myString);

		// as seen in text (Ford & Topp, pg. 32).
		comma = myString.find(",");
		secondComma = myString.rfind(",");
		totalLength = myString.length();
		first = myString.find(' ');
		middle = myString.find(' ', first + 1);
		last = myString.find(' ', middle + 1);
	}

	// as seen in text (Ford & Topp, pg. 32-33).
	string x = myString.substr(0, comma);
	x.insert(0, " ");
	// using substr to extract the pieces from y
	string y = myString.substr(first + 1, (middle - first));
	// using substr to extract the pieces from z
	string z = myString.substr(middle + 1, (totalLength - middle));

	// reassemble the string to overwrite the string with new value using string concatenation
	myString.insert(x.length() + y.length() + 1, " " + z.substr(0, 1));
	myString.erase(); // erase the old string

	// appends the seperated parts of the new empty string
	myString.append(y);
	myString.append(z);
	myString.append(x);
} //end inputData() method

void outputData(string newName)           // method to output the data using calling by value
{
	cout << "\n Thank you, your name is:" << endl << endl;

	cout << newName << endl << endl;

	system("PAUSE"); // pauses the screen

}