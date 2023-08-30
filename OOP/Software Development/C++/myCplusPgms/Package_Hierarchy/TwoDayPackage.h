// Definition of derived class TwoDayPackage.
// Package.
#ifndef TWODAY_H
#define TWODAY_H

#include <string> // C++ standard string class
#include "Package.h" // Package class definition
using namespace std;

class TwoDayPackage : public Package  // TwoDayPackage derived from Package
{
public:
	//function to calculate the shipping cost
	double calcShippingCost( float weight, double costPerOunce, double flatFee)
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

#endif
