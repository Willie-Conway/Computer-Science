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



/*header file */
#include <iostream>
#include <cstdlib>

using namespace std;

#include "Rational.h"
/*Constructor */
 RationalNumber::RationalNumber ( int n, int d )
 {
 numerator = n;
 denominator = d;
 reduction();
 }
 /*Addition */
 RationalNumber RationalNumber::operator+(const
 RationalNumber &a )
  {
  RationalNumber sum;
  sum.numerator = numerator * a.denominator + denominator *
 a.numerator;
  sum.denominator = denominator * a.denominator;
  sum.reduction();
  return sum;
  }
 /*Subtraction */
  RationalNumber RationalNumber::operator-(const
 RationalNumber &s )
 {
  RationalNumber sub;
  sub.numerator = numerator * s.denominator - denominator *
 s.numerator;
  sub.denominator = denominator * s.denominator;
  sub.reduction();
  return sub;
  }
  /*Multiplication */
 RationalNumber RationalNumber::operator* (const
 RationalNumber &m )
 {
  RationalNumber multiply;
  multiply.numerator = numerator * m.numerator;
  multiply.denominator = denominator * m.denominator;
  multiply.reduction();
  return multiply;
  }
 /*Division */
  RationalNumber RationalNumber::operator/( RationalNumber
 &d )
  {
  RationalNumber divide;
  if ( d.numerator != 0 ) { // check for a zero in numerator
  divide.numerator = numerator * d.denominator;
  divide.denominator = denominator * d.numerator;
  divide.reduction();
  }
  else {
  cout << "Error: Divide by zero "<< endl;
  exit( 1 ); // stdlib function
  }
   return divide;
  }

  bool RationalNumber::operator>( const RationalNumber &gr )
 const
 {
  if ( static_cast<double>( numerator ) / denominator >
 static_cast<double>( gr.numerator ) / gr.denominator )
  return true;
 else
  return false;
  }

  bool RationalNumber::operator<(const RationalNumber &lr)
  const
   {
   if (static_cast<double>( numerator ) / denominator <
   static_cast<double>( lr.numerator )/ lr.denominator )
   return true;
   else
   return false;
   }

   bool RationalNumber::operator>=( const RationalNumber &ger
  ) const
   { return *this == ger || *this > ger; }

   bool RationalNumber::operator<=( const RationalNumber &ler
  ) const
  { return *this == ler || *this < ler; }

   bool RationalNumber::operator==(const RationalNumber &er
  ) const
   {
   if ( numerator == er.numerator && denominator ==
  er.denominator )
   return true;
   else
   return false;
   }

   bool RationalNumber::operator!=( const RationalNumber &ner
  ) const
   { return !( *this == ner ); }

   void RationalNumber::display( void ) const
  {
   if ( numerator == 0 )
   cout << numerator;
   else if ( denominator == 1 )
   cout << numerator;
   else
   cout << numerator << '/' << denominator;
   }

   void RationalNumber::reduction( void )
   {
   int largest;
   int gcd = 1;

   largest = ( numerator > denominator ) ? numerator:
  denominator;

   for ( int loop = 2; loop <= largest; ++loop )
   if ( numerator % loop == 0 && denominator % loop == 0 )
   gcd = loop;

   numerator /= gcd;
   denominator /= gcd;
   }
