//Willie Conway
//Project 11- Exercise 12.9
//Package Inheritance Hierarchy


#ifndef PACKAGE_H
#define PACKAGE_H

#include <string> // C ++ standard string class
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

#endif
   					 					   													  								   						  														   							                      
																				 		 		     
