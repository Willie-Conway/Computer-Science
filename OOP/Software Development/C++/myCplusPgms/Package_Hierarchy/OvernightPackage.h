// Definition of derived class OvernightPackage
// Package.
#ifndef OVERNIGHT_H
#define OVERNIGHT_H

#include <string> // C++ standard string class
#include "Package.h" // Package class definition
using namespace std;



class OvernightPackage : public Package //OverNightPackage derived from Package
{
public:
	double calcCostOvernight( float weight, double costPerOunce, double additionalCost)
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

#endif
