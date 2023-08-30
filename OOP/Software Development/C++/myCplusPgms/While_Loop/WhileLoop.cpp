//Willie Conway
//Class: CS225DLA2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 2
/****************************************************************************************************/
//This program utilizes a while loop that loops ten times until a number is greater than or equal
//to ten and performs a caculation to sum up up the total of the numbers.
/***************************************************************************************************/
//Directions:
//You are to complete exercise 3.12 in the Deitel text.
//Submit as a .cpp file by Sunday at 11:59pm (CST).
/****************************************************************************************************/

#include <iostream>
using namespace std;// standard library to use streams

int main()// beginning of main program
{
	int y; 			//declare y variable
	int x = 1;  	//declare x variable with assigned value
	int total = 0; 	//calculate total using int total variable

	while (x <= 10)	//create loop that will loop ten times until a number is greater than or equal to 10

	{
		y = x*x; 			//function to perform calculation task
		cout << y << endl; 	//complete loop process
		total += y; 		//add y sum to total
		x++; 				//utilize x counter to keep track of increments

	}

	cout << "And the total is: " << total << endl;  //output result total

	system("pause");
	return 0;// end program

}// end main