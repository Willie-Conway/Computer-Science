/**************************************************************************************************************************
* Willie Conway                                                                                                           *
* CS225DLAS2A2017                                                                                                         *
* Assignment5.cpp                                                                                                         *
*                                                                                                                         *
* Programming Project Assignment 5                                                                                        *
*                                                                                                                         *
* This Program takes the main() function , displays the pleasing banner                                                   *
* "Let's see if you are "rich" or not!"                                                                                   *
* From the main function, then calls a user-defined function calcWealth() which                                           *
* prompts the user for age, amount of cash on hand, number of dependents                                                  *
* and amount of money owed to creditors. It uses an 'int' to represent age                                                *
* and number of dependents but uses a ‘long’ to represent amount of cash on                                                *
* hand and the amount of money owed.                                                                                      *
*                                                                                                                         *
* Next it uses main()function to call a user-defined boolean function,isRich(),                                           *
* which accepts as arguments the age,cash on hand,number of dependents, and amount owed.                                  *
* isRich()caculates the "true cash value" and then determines if someone is rich. Here is                                 *
* the criteria for isRich():                                                                                              *
*                                                                                                                         *
* The amount owed must be subtracted from the cash on hand to determine a preliminary “true cash value”                   *
* If a person is has no dependents and a true cash value of $1 million or more, he can be considered rich                 *
* – regardless of age.                                                                                                    *
* If  a person is < 40 years old, subtract $150,000 from his true cash value for each dependent (e.g.,                    *
* if a person has three dependents, subtract $450,000)                                                                    *
* If a person is 40-50 years old, subtract $75,000 from his true cash value for each dependent                            *
* If a person > 50 years old, subtract $25,000 from his true cash value for each dependent                                *
* Return the value of ‘true’ to main() is the person’s true cash value >= $1 million; otherwise, return a value of ‘false’*
* The main() function receives the boolean value from isRich() and displays a message indicating whether a person is rich *
* or not.                                                                                                                 *
***************************************************************************************************************************/

#include<iostream>
using namespace std;

//function prototype for calcWealth()
void calcWealth(int *age, int *dependents, long *cash, long *owed);

//function prototype for isRich()
bool isRich(int age, int dependents, long cash, long owed);
int main()
{
	//banner
	cout << "Let's see if you are \"rich\" or not!\n" << endl;

	//declaring the local variables that will be used in main
	int age = 0, dependents = 0;
	long cash = 0, owed = 0;

	//calling the calcWealth() function and returns the pointers to the objects
	calcWealth(&age, &dependents, &cash, &owed);

	//calling isRich function and displays results
	//The call operator uses the information to locate the code that it must jump to
	bool rich = isRich(age, dependents, cash, owed);

	//displays results of the isRich() function using an if..else statement
	if (rich == true)
		cout << "Congratulations! We consider you as being \"rich.\"\n";
	else
		cout << "I am sorry! You are not yet \"rich.\"\n";

	system("pause"); //pause to display results
	//return 0;
}//end main

//user-defined function calcWealth() and passing pointers to each property
void calcWealth(int *age, int *dependents, long *cash, long *owed)
{
	//prompt user to enter age
	cout << "Please enter your age: ";
	//cin will take the pointer and refer to the value at that location
	cin >> *age;

	//prompt user to enter amount of cash on hand
	cout << "Please enter the amount of cash on hand: ";
	cin >> *cash;

	//prompt user to enter amount of dependents
	cout << "Please enter the amount of dependents you have: ";
	cin >> *dependents;

	//prompt user to enter amount of money owed
	cout << "Please enter the amount of money you owe: ";
	cin >> *owed;
} //end calcWealth function

//boolean function that will return the value
bool isRich(int age, int dependents, long cash, long owed)

{
	//creating variable for "true cash value" by subtracting amount owed from the cash on hand
	long trueCashValue = cash - owed;

	//if..else statements to Calculate if person is rich or not
	if (dependents == 0)
	{
		if (trueCashValue >= 1000000)
		{
			return true;
		}
		else
			return false;
	}

	else if (age < 40)
	{
		trueCashValue -= dependents * 150000;
		if (trueCashValue >= 1000000)
		{
			return true;
		}
		else
			return false;
	}

	else if (age >= 40 && age <= 50)
	{
		trueCashValue -= dependents * 75000;
		if (trueCashValue >= 1000000)
		{
			return true;
		}
		else
			return false;
	}

	else
	{
		trueCashValue -= dependents * 25000;
		if (trueCashValue >= 1000000)
		{
			return true;
		}
		else
			return false;
	}
} //end isRich function
