//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 8
/****************************************************************************************************/
//Program that uses the class RationalNumber, which will have the following capabilites, creates a constructor
//that will division by zero, reduces the fractions that are not in their simplest form to their simplest form,
//and lastly will avoid the use of negative denominators. The constructor will also complete simple
//overloading of the addition,subtraction, multiplication and division of the fractions and will overload the
//relational and equality operators for the class.
/****************************************************************************************************/







/*header file*/
 #include <iostream>
/*rational header file */
 #include "Rational.h"

using namespace std;
 int main()
 {

//Calling RationalNumber class
      RationalNumber a(20, 8 ), b( 6, 9 ), value;
/* Addition */
 a.display();
 cout << " + " ;
 b.display();
 cout << " = ";
 value = a + b;
/*Display */
 value.display();
 cout << '\n';
/*Subtraction */
 a.display();
 cout << " - " ;
 b.display();
 cout << " = ";
 value = a - b;
/*Display*/
 value.display();
 cout << '\n';
/*Multiplication */
 a.display();
 cout << " * " ;
 b.display();
 cout << " = ";
 value = a * b;
/*Display */
 value.display();
 cout << '\n';
/*Division */
 a.display();
 cout << " / " ;
 b.display();
 cout << " = ";
 value = a / b;
/*Display */
 value.display();
 cout << '\n';
/*Display Output*/
 a.display();
 cout << " is:\n";
 cout << ( ( a > b ) ? " > " : " <= " );
 b.display();
 cout << " \n\n according to the overloaded > operator";
 cout << ( ( a < b ) ? " < " : " >= " );
 b.display();
 cout << " \n\n according to the overloaded < operator\n";
 cout << ( (a >= b ) ? " >= " : " < " );
 b.display();
 cout << " \n\n according to the overloaded >= operator\n";
 cout << ( ( a <= b ) ? " <= " : " > " );
 b.display();
 cout << " \n\n according to the overloaded <= operator\n";
 cout << ( ( a == b ) ? " == " : " != " );
 b.display();
 cout << " \n\n according to the overloaded == operator\n";
 cout << ( ( a != b ) ? " != " : " == " );
 b.display();
 cout << " \n\n according to the overloaded != operator" << endl;

 system ("pause");
 return 0;
 }
