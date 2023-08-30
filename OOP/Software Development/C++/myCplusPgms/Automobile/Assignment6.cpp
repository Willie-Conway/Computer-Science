/****************************************************************************************************/
//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 6
/****************************************************************************************************/
//This program utilizes the concepts learned in Chapters 6-7, i.e., Arrays.
//Write a program that prompts the user for the prices of 10 automobiles (use looping to do this and store the prices in an array).
//The automobiles may be priced from less than $1 up to $99,999.  No negative numbers are allowed.
//Perform error checking to ensure that only valid numbers are entered ($1 - $99,999).
//Using a function, calculate and display the number of cars in all 10 price categories, i.e., $1 - $9999, $10,000 - $19,999, $20-000 - $29,999, … $90,000 - $99,999.
//Call a function that loops through the array, and displays the highest and lowest priced cars only.
//Call a separate function which calculates the average of all of the cars, and passes the average amount back to the main() function, where it is printed out.
/****************************************************************************************************/


#include <iostream> //Needed to provide program input/output
#include <iomanip>  //Needed to manipulate program output
#include <string>  //Needed as string variables are to be used
using namespace std; //Using std namespace

//Function prototypes
void calculateAndPrintCars(double prices[], int size);
double getAverage(double prices[], int size);

//Start of main function
int main()
{
   const int MAX_AUTOMOBILES = 10; //Set Max number of automobiles

   double prices[MAX_AUTOMOBILES];
   double cost;

   for(int i = 0; i < MAX_AUTOMOBILES; i++)
   {
       cout << "Please enter the price of Automobile #" << (i + 1) << ": "; //Prompt user for auto price
       cin >> cost;

       while(cost < 1 || cost > 99999) //Set cost parameters
       {
           cerr << "No negative numbers are allowed." << endl;  //Reminder that no negative number imputs are allowed
           cout << "Please enter the price of Automobile #" << (i + 1) << ": ";  //Prompt for auto price
           cin >> cost;
       }

       prices[i] = cost;
   }

   calculateAndPrintCars(prices, MAX_AUTOMOBILES);

   double average = getAverage(prices, MAX_AUTOMOBILES);  //Return average price of MAX_AUTOMOBILES

   cout << "The average price of all the cars is: $" << setprecision(0) << fixed << average << " (round to the nearest dollar)" << endl;  //Outprint header for average all car cost

   cout << endl;
   system("pause");
   return 0;
} //End of main function

//Start calculateAndPrintCars function implementation
void calculateAndPrintCars(double prices[], int size)
{
   int count;
   double highest = prices[0]; //Set highest parameter
   double lowest = prices[0]; //Set lowest parameter
   double maxRange = 9999; //Set maxRange parameter
   double minRange = 1; //Set minRange parameter

   cout << endl;
   for(int i = 0; i < size; i++)
   {
       if(prices[i] > highest)  //Used to calculate highest prices
           highest = prices[i];

       if(prices[i] < lowest)  //Used to calculate lowest prices
           lowest = prices[i];

       count = 0;

       for(int j = 0; j < size; j++)
       {
           if(prices[j] >= minRange && prices[j] <= maxRange)  //Determine price range
               count++;
       }

       cout << "The number of cars in the $" << minRange << " - $" << maxRange << " range is: " << count << endl;  //Outprint header for max/minRange
       maxRange = maxRange + 10000; //Calculate maxRange
       minRange = maxRange - 9999;  //Calculate minRange
   }

   cout << "The highest priced car is: $" << highest << endl;  //Outprint highest priced car
   cout << "The lowest priced car is: $" << lowest << endl;  //Outprint lowest priced car
} //End of calculateAndPrintCars function

//Start getAverage function implementation
double getAverage(double prices[], int size)
{
   double total = 0;

   for(int i = 0; i < size; i++)
       total = total + prices[i];

   return total / size;
} //End of getAverage function