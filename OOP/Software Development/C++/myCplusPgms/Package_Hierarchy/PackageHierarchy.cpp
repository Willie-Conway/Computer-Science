//Displays order in which base-class and derived class constructors
// and destructors are called
#include <iostream>
#include <iomanip>
#include "Package.h"
#include "TwoDayPackage.h"
#include "OvernightPackage.h"
using namespace std;


int main()
{
	int usersChoice, senderZip, recipientZip;
	string senderFirstName, senderLastName, senderAddress, senderCity, senderState,
		recipientFirstName, recipientLastName, recipientAddress,
		recipientCity, recipientState;
	double costPerOunce, flatFee, additionalCost;
	float packageWeight;

	Package base;   //calling the base case of the package class
	TwoDayPackage twoDay;  //calling the two day Package of the first inherited class
	OvernightPackage overnight;   //calling the over night of the second inherited calss

	//prompt the user for input
	cout << "Welcome to our Package-Delivery Service!" << endl << endl;
	cout << "Please Answer the follow questions: " << endl << endl;

	cout << "Enter Package Weight(in ounces): "; //prompt to enter the weight of package
	cin >> packageWeight;
	cout << endl;

	cout << "Enter Cost Per Ounce: "; //prompt to enter the cost per ounce of package
	cin >> costPerOunce;
	cout << endl;

	//prompt to have user choice which shipping method they would like to calculate
	cout << "Please Enter Your Choice For which shipping method you would like to calculate:" << endl;
	cout << "1: Calculate the Base Cost  " << endl;
	cout << "2: Calculate the Two Day Cost " << endl;
	cout << "3: Calculate the Over Night Cost" << endl << endl;
	cin >> usersChoice;
	cout << endl;

	//switch statement to calc each choice based off users choice
	switch (usersChoice)
	{
	case 1:
		base.calculateCost(packageWeight, costPerOunce);
		cout << endl;
		break;

	case 2:
		cout << "Enter Flat Cost: " << endl;
		cin >> flatFee;
		twoDay.calcShippingCost(packageWeight, costPerOunce, flatFee);
		cout << endl;
		break;

	case 3:
		cout << "Enter The Additional Cost: " << endl;
		cin >> additionalCost;
		overnight.calcCostOvernight(packageWeight, costPerOunce, additionalCost);
		cout << endl;
		break;

	default:
		cout << "Error, Please enter either 1, 2 or 3: " << endl;
		cout << endl;
	} // end switch

	cout << "Enter Sender First Name: ";
	cin >> senderFirstName;
	base.setfirstName(senderFirstName);  //calling the sender first name function

	cout << "Enter Sender Last Name: ";
	cin >> senderLastName;
	base.setlastName(senderLastName);  //calling the sender last name function

	cout << "Enter Sender Address: ";
	cin >> senderAddress;
	base.setAddress(senderAddress); //calling the sender address function

	cout << "Enter Sender City: ";
	cin >> senderCity;
	base.setCity(senderCity); //calling the sender city function

	cout << "Enter Sender State: ";
	cin >> senderState;
	base.setState(senderState); //calling the sender state function

	cout << "Enter Sender ZIP code: ";
	cin >> senderZip;
	cout << endl;
	base.setZip(senderZip); //calling the sender zip code

	cout << "Enter Recipient First Name: ";
	cin >> recipientFirstName;
	base.setfirstName(recipientFirstName);  //calling the recipient first name function

	cout << "Enter Recipient Last Name: ";
	cin >> recipientLastName;
	base.setlastName(recipientLastName);  //calling the recipient last name function

	cout << "Enter Recipient Address: ";
	cin >> recipientAddress;
	base.setAddress(recipientAddress); //calling the recipient address function

	cout << "Enter Recipient City: ";
	cin >> recipientCity;
	base.setCity(recipientCity); //calling the recipient city function

	cout << "Enter Recipient State: ";
	cin >> recipientState;
	base.setState(recipientState); //calling recipient the state function

	cout << "Enter Recipient Zip code: ";
	cin >> recipientZip;
	cout << endl;
	base.setZip(recipientZip); //calling the recipient zip code

	cout << senderFirstName + ", Thank you for choosing our package-delivery service!" << endl;
	cout << endl;

	system("pause");
	return 0;
} // end main