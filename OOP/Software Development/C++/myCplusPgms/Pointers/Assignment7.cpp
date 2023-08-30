//Willie Conway
//Class: CS225DLAS2A2017
//Complete Exercises 7.9 -7.11 found at the end of Chapter 7
//In this sets of exercises, you will learn to work with pointers, write function headers and prototypes, and debug pointer and character errors.
//Programming Concepts
//Assignment : Programming Project Assignment 7
/****************************************************************************************************/

/*

7.9

a) long *longPtr;

b) longPtr = &value1;

c) cout << *longPtr;

d) value2 = *longPtr;

e) cout << value2;

f) cout << *value1;

g) cout << longPtr; YES


7.10

a) void zero(long int * bigIntegers);

b) void zero(long int *);

c) int add1AndSum (int * oneTooSmall);

d) int add1AndSum (int * );


7.11

a) int *number;
   cout << number << endl;
   ***You need to use *number in order to print the address of number

b) double *realPtr;
   long *integerPtr;
   integerPtr = realPtr;
   error cannot convert 'double*' to 'longint*' in assignment
   ***Use *integerPtr = *realPtr; this way it produces a warning that realPtr isn't being initialized in the fuction

c) creates an invalid conversion from int to int\
   use int * x,y;
    ***Use either x = y; or x = &y; instead

d)  char s[] = "this is a character array";
	for ( ; *s != '\0'; s++)
		cout << *s << '  ';
	***The pointer needs to be incremented

e) short *numPtr, result;
   void *genericPtr = numPtr;
   result = *genericPtr + 7;
   ***This creates the error void* is not a pointer-to-obejct type.  It is diferenciating between the void * before casting it to a concrete type. Needs to be done other way around.

f) double x = 19.34;
   double xPtr = &x;
   cout << xPtr << endl;
   ***This creates the error: cannot convert 'double*' to 'double' in initialization.
*/