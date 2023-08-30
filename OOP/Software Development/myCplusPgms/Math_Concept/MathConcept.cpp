//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 1
/****************************************************************************************************/
//Directions:
//You are to complete exercise 2.19 in the Deitel text.
/****************************************************************************************************/
//This Program inputs three different integers from the keyboard, then prints the sum,the average,
//the product, the smallest, and the largest of the numbers.
/****************************************************************************************************/
/****************************************************************************************************/

#include <iostream>
using namespace std;// standard library to use streams



int main()// beginning of main program
{
	int number1;// sets user input of interger number 1
	int number2;// sets user input of interger number 2
	int number3;// sets user input of interger number 3
	int min =0;// sets user input of interger min
	int max =0;// sets user input of interger max

	cout << "Input three different integers: ";// Lists three inputs
	cin >> number1 >> number2 >> number3;// accepts user response as input for interger number 1, number 2, number 3

	min = number1;
		if (number2 < min) min = number2;
		if (number3 < min) min = number3;

	max = number1;
		if (max < number2) max = number2;
		if (max < number3) max = number3;


	cout << "Sum is: " << number1 + number2 + number3 << endl;// outputs line for sum
	cout << "Average is: " << (number1 + number2 + number3) / 3 << endl;// outputs line for average
	cout << "Product is: " << number1 * number2 * number3 << endl;// outputs line for product
	cout << "Smallest Number is: " << min << endl;// outputs line for smallest number
	cout << "Largest Number is: " << max << endl;// outputs line for largest number




	system("pause");
	return 0; // ends program
}// ends main
