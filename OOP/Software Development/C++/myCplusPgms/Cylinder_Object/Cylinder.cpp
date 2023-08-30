//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 8 (Part 1)
/****************************************************************************************************/
//Create a class named Cylinder with a field for the radius. Be sure to include the following:
//a default constructor that sets the radius to 3
//a setter function to set the value of the radius
//a setter function to set the value of the height
//a getter function to return the value of the radius
//a getter function to return the value of the height
//a method to compute and return the cylinder's surface area
//Be aware that the surface area of a cylinder is 2 * pi * radius * radius + 2 * pi * radius * height.  Feel free to use the value of 3.14 for pi.
//After creating this class, write a second class, TestCylinder, that creates an object with a radius of 10. It should also create a second Cylinder object that uses the radius set by the default constructor.
//Once the objects have been created, write code to display the surface area of both cylinders in an attractive fashion.
/****************************************************************************************************/

//Cylinder class defintion
#ifndef CYLINDER_H
#define CYLINDER_H
class Cylinder
{
private:
   double radius;
   double height;
public:
   Cylinder();
   Cylinder(double radius);
   void setRadius(double r);
   void setHeight(double h);
   double getRadius();
   double getHeight();
   double getSurfaceArea();
   void display();
};

#endif CYLINDER_H

---------------------------------------------------------------------


//Implementation file of Cylinder class
#include<iostream>
#include "Cylinder.h"
using namespace std;

//default cylinder that sets the radius to 3
Cylinder::Cylinder()
{
   this->radius=3;
}
//Parameterized cylinder that sets the radius
Cylinder::Cylinder(double r)
{
   this->radius=r;
}
//set height value
void Cylinder::setHeight(double h)
{
   this->height=h;
}

//set radius value
void Cylinder::setRadius(double r)
{
   this->radius=r;
}
//Caluclates the surface area
double Cylinder::getSurfaceArea()
{
   const double PI=3.14;
   return 2*PI*radius*radius + 2*PI*radius*height;
}

void Cylinder::display()
{
   cout<<"The cylinder with a radius of"<<radius
       <<" and height of "<<height<<" has a surface area of :"<< getSurfaceArea()<<endl;
}


----------------------------------------------------------------------------------------

#include<iostream>
//include the header file Cylinder
#include "Cylinder.h"
using namespace std;
int main()
{

   double radius;
   double height;

   //read radius and height
   cout<<"Please enter the radius:";
   cin>>radius;
   cout<<"Please enter the height:";
   cin>>height;

   //set height of the cylinderone
   //Gets the default radius =3 for first cylinder
   Cylinder cylinderOne;

   cylinderOne.setHeight(height);


   Cylinder cylinderTwo;
   //set radius and height of the cylinderone
   cylinderTwo.setRadius(radius);
   cylinderTwo.setHeight(height);

   //display the first and second cylinder surace area
   cylinderOne.display();
   cylinderTwo.display();

   system("pause");
   return 0;
}