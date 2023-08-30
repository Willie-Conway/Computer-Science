//Willie Conway
//Project 11- Exercise 12.9
//Package Inheritance Hierarchy

#include <iostream>
#include <string>
using namespace std;

//base class of the hierarchy called package
class Package
{
private:
	string firstName, lastName, address, city, state, sender, recipient; //data members
	int zip;
	float weight;  // in ounce
	double cost;  // weight per ounce

public: //member functions
	void setfirstName(string firstName);
	void setlastName(string lastName);
	void setCity(string city);
	void setState(string state);
	void setZip(int zip);
	void setAddress(string address);
	void setSender(string sender);
	void setRecipient(string recipient);
	string getfirstName()
	{
		return firstName;
	}
	string getlastName()
	{
		return lastName;
	}
	string getCity()
	{
		return city;
	}
	string getState()
	{
		return state;
	}
	int getZip()
	{
		return zip;
	}
	string getAddress()
	{
		return address;
	}
	string getSender()
	{
		return sender;
	}
	string getRecipient()
	{
		return recipient;
	}

	double calculateCost(float weight, double costPerOunce)
	{
		double cost;  //total cost = weight*cost per ounce
		cost = weight * costPerOunce;

		cout << "The Base Cost is = $" << cost << endl;
		return cost;
		cout << endl;
	}
}; // end class Package

void Package::setfirstName(string f)
{
	firstName = f;
}
void Package::setlastName(string l)
{
	lastName = l;
}
void Package::setCity(string c)
{
	city = c;
}
void Package::setState(string s)
{
	state = s;
}
void Package::setZip(int z)
{
	zip = z;
}
void Package::setAddress(string a)
{
	address = a;
}
void Package::setSender(string s)
{
	sender = s;
}
void Package::setRecipient(string r)
{
	recipient = r;
}

//Two Day Package derived from Package
class TwoDayPackage : public Package
{
public:
	//function to calculate the shipping cost
	double calcShippingCost(float weight, double costPerOunce, double flatFee)
	{
		double twoDayCost;

		twoDayCost = calculateCost(weight, costPerOunce) + flatFee;
		cout << "The Two Day Package will Cost = $" << twoDayCost << endl;
		return twoDayCost;
		cout << endl;
	}
private:
	double flatFee;
}; // end TwoDayPackage

   //OverNightPackage derived from Package
class OvernightPackage : public Package
{
public:
	double calcCostOvernight(float weight, double costPerOunce, double additionalCost)
	{
		double overNight; //shipping cost of the over night class
		overNight = calculateCost(weight, costPerOunce) + (additionalCost * weight);

		cout << "The Overnight Package will Cost = $" << overNight << endl;
		return overNight;
		cout << endl;
	}
private:
	double overnightCost; //per ounce
}; // end class OvernightPackage

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
