//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 9
/****************************************************************************************************/
//Description
//In this project you will write a banking program that calculates interest payments, balances due, etc.
//You will learn how to write driver programs, use static variables, and access private members of a class.
//Directions
//You are to complete exercise 10.7 in the Deitel text.
//Submit as a .cpp file by Sunday at 11:59pm (CST).
/****************************************************************************************************/

#include <iostream> //Used to preform input and output
#include <iomanip>  //For parameterized stream manipulators

using namespace std;

class SavingsAccount
{
	public:
		SavingsAccount(){}
		SavingsAccount(int value);
		~SavingsAccount(){}
		static float annualInterestRate;
		void calculateMonthlyInterest();
		static void modifyIntererestRate(float value);
		float GetBalance() const { return savingsBalance; }
	private:
		float savingsBalance;
};

//Used to copy the constructor to initialize the value
SavingsAccount::SavingsAccount(int value)
{
	savingsBalance = value;
}

//Set a static data member annualInterestRate to store the annual interest rate for each of the servers
float SavingsAccount::annualInterestRate = 0;

//Used to calculate monthly interest and then adds interest
void SavingsAccount::calculateMonthlyInterest()
{
	savingsBalance += ((savingsBalance * annualInterestRate) / 12);
}

//Set the static annualInterestRate to a new value
void SavingsAccount::modifyIntererestRate(float value)
{
	annualInterestRate = value;
}

int main()
{
	//Base values for the settings saver1 & saver2 accounts
	SavingsAccount saver1(2000.00);
	SavingsAccount saver2(3000.00);

	//Set annualInterestRate to 3%
	SavingsAccount::modifyIntererestRate(3);

	//Calculate monthly interest and print the new balances
	cout << setprecision(2) << fixed;
	cout << "Figured with a 3% annual interest rate." << endl;
	saver1.calculateMonthlyInterest();
	cout << "Saver 1 Savings Balance: $" << saver1.GetBalance() << endl;
	saver2.calculateMonthlyInterest();
	cout << "Saver 2 Savings Balance: $" << saver2.GetBalance() << endl;

	cout << endl;

	//Set annualInterestRate to 4%
	SavingsAccount::modifyIntererestRate(4);

	//Calculate next month's interest and print the new balances
	cout << "Figured with a 4% annual interest rate," << endl;
	saver1.calculateMonthlyInterest();
	cout << "Saver 1 Savings Balance: $" << saver1.GetBalance() << endl;
	saver2.calculateMonthlyInterest();
	cout << "Saver 2 Savings Balance: $" << saver2.GetBalance() << endl;
	cout << endl;

	return 0;
}
