/**************************************************************************************************************************
* Willie Conway                                                                                                           *
* CS225DLAS2A2017                                                                                                         *
* CWUnit1Ch2.cpp                                                                                                          *
*                                                                                                                         *
* This Program inputs three different integers from the keyboard, then prints the sum,the average,                        *
* the product, the smallest, and the largest of the numbers.                                                              *
*                                                                                                                         *
* Programing Project Assignment1 2.19 from Deitel txt.                                                                    *
* Page 63/ Exercise 2.19                                                                                                  *
*                                                                                                                         *
* (Arithmetic, Largest value and Smallest Value) Write a program that inputs                                              *
* three different integers from the keyboard, then prints the sum,the average,                                            *
* the product, the smallest, and the largest of these numbers. The screen dialog                                          *
* should appear as follows:                                                                                               *
*                                                                                                                         *
* Input three different integers: 13 27 14                                                                                *
* Sum is 54                                                                                                               *
* Average is 18                                                                                                           *
* Product is 4914                                                                                                         *
* Smallest is 13                                                                                                          *
* Lasrgest is 27                                                                                                          *
***************************************************************************************************************************/




#include <iostream>
using namespace std; // standard library to use streams

int main () // beginning of main program
{
	int number1; // sets user input of interger number 1
	int number2; // sets user input of interger number 2
	int number3; // sets user input of interger number 3
	int sum;     // sets user input of interger sum
	int average; // sets user input of interger average
	int product; // sets user input of interger product
	cout<< "Please enter first interger:"; // output line asking for first user interger input
	cin>>number1;                          // accepts user response as input for interger number1
	cout<<"Please enter second interger:"; // output line asking for second user interger input
	cin>>number2;                          // accepts user response as  input for interger number 2
	cout<<"Please enter third interger:"; // output line asking for third user interger input
	cin>>number3;                         // accepts user response as input for interger number 3
	sum = number1+number2+number3;        // caculate the sum of all three intergers
	average = number1+number2+number3 / 3; // caculates the average of all three intergers by taking the sum and dividing by three
	product = number1 * number2 * number3; // caculates the product of the intergers by multiplying them together
	cout<< endl << "Input three different integers: " << number1 << " " << number2 << " " << number3 << endl; // Lists three inputs
	cout<<"Sum is:"<< sum <<endl;          // outputs line for sum
	cout<<"Average is:"<< average <<endl; // outputs line for average
	cout<<"Product is:"<< product <<endl; // outputs line for product

	return 0; // ends program

} // ends main