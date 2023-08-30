//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 3
/****************************************************************************************************/
// This program uses a while statement to input each salesperson's gross sales for last week and caculates
// and displays that salesperson's earnings. It Processes one salesperson's figures at a time.
/****************************************************************************************************/
//Directions:
//You are to complete exercise 3.15 in the Deitel text.
//Submit as a .cpp file by Sunday at 11:59pm (CST).
/****************************************************************************************************/

#include <iostream>                                       // For program input/output
#include <iomanip>                                        // parameterized stream manipulators

using namespace std;                                      // standard library to use streams

int main()                                                // Beginning of main program
{
    double tSales = 0.0;                                  // Default value for Total Sales
    double fSalary = 0.0;                                 // Default value for final Salary

    cout  << "Enter sales in a dollars (-1 to end): ";    // Prompt user to input total sales for the week
    cin >> tSales;                                        // Store user input in defined tSales parameter

     while (tSales != -1)                                 // Continue the program loop until user enters program kill value
    {
        cout << setprecision(2) << fixed;                 // Use set prescion(2) to provide two values after decimal point (as seen in book)
        fSalary= 200 + (tSales * .09);                    // Used to calculate final salary (for week)
        cout << "Salary is : $" << fSalary << endl;        // Display user salary based on total sales
        cout <<""<< endl;                                 // Add blank space below output (as seen in book)
        cout  << "Enter sales in dollars (-1 to end): ";  // Prompt user for weekly total sales (once again)
        cin >> tSales;                                    // Store total values in tSales parameter
    }                                                     // End of loop
}// End main