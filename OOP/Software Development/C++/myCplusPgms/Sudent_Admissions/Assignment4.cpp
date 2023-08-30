//Willie Conway
//Class: CS225DLAS2A2017
//Programming Concepts
//Assignment : Programming Project Assignment 4
/****************************************************************************************************/
// This program determines if a student is eligible for admission at your school.It prompts the user for
// for both the both the GPA score and the entrance score and continues to ask for input until the user
// enters 0.0 as the GPA.
/****************************************************************************************************/
//Directions:
//You are the Admissions Office at ABC Medical University.  You have a large number of applicants for a very few number of available openings at your school.  As a result, you need to set some high admission standards.
//To be accepted, a student must have a Grade Point Average (GPA) of 3.7 (on a scale of 0.0 - 4.0) or higher combined with an entrance score exam of 32 or higher.  Or, alternatively, the student can have an entrance score of 40 (on a scale of 1-44) or higher, in which case it doesn't matter what the GPA is.
//Write a program which determines if a student is eligible for admission at your school.  You should prompt the user for both the GPA score and the entrance score.  Continue to ask for input until the user enters 0.0 as the GPA.
/****************************************************************************************************/

#include <iostream> //Used to provide input/output operations for program

using namespace std; //standard library to use streams

int main()           // Beginning of main program

{
  float GPA;
  int SC;
  while (1)
  {
    cout << "Please enter your GPA: "; //Prompt user to enter GPA
    cin >> GPA;
    if (GPA == 0.0) //Define GPA value
      break;
    cout << "Please enter your entrance score: "; //Prompt user to enter entrance score
    cin >> SC;
    if (SC >= 40 || (SC >= 32 && GPA >= 3.7)) //Checks user defined GPA against parameters
    {
      cout << "Congratulations! You are hereby admitted to ABC Medical University" //Requirements met for ABC Medical University

           << endl; //End session and restart program
    }
    else
      cout << "We are sorry! You are hereby denied admission to ABC Medical University" //Requirements NOT met for ABC Medical University

           << endl;//End session and restart program
  }
  cout << "Thank you for your use of the Admissions Software Program at ABC Medical University"; // Program end output
  return 0; //Return 0
} // End main
