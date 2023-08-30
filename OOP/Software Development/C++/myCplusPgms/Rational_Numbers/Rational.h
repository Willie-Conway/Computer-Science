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
/*******************************************************************
* This C++ program creates the RationalNumber class                *
*******************************************************************/

/*Rational header */
 #ifndef RATIONAL
 #define RATIONAL

 class RationalNumber {

 public:
 /*Constructer */
 RationalNumber( int = 0, int = 1 );
 RationalNumber operator+( const RationalNumber& );
 RationalNumber operator-( const RationalNumber& );
 RationalNumber operator*( const RationalNumber& );
 RationalNumber operator/( RationalNumber& );
 bool operator>( const RationalNumber& ) const;
 bool operator<( const RationalNumber& ) const;
 bool operator>=( const RationalNumber& ) const;
 bool operator<=( const RationalNumber& ) const;
 bool operator==( const RationalNumber& ) const;
 bool operator!=( const RationalNumber& ) const;
 void display( void ) const;
 private:
 int numerator;
 int denominator;
 void reduction( void );
};

#endif