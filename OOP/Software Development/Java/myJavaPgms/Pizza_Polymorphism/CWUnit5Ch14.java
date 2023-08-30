/***********************************************************************************
* CWUnit5Ch14.java
* Willie Conway
*
* This is the driver class for the Pizza class.
*
* Write a super basic Pizza ordering system using Polymorphism.
* The setCrust method varies based on which type of Pizza is instantiated.
*
* This program gets the  input for Cheese or Meat pizza.
* Declares a single pizza to be used for both Cheese and Meat.
* If a Meat pizza is selected it will
* instantiate your pizza as a LiFiPizza pizza with zero arguments.
* setType to Meat via the constructor.
*
* If a Cheese pizza is selected,
* Instantiate your pizza as a LiFiCheese pizza with zero arguments.
* Output of your order varies based on Cheese or Meat.
*
***********************************************************************************/

import java.util.Scanner;

public class CWUnit5Ch14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.print("What type of pizza would you like (Cheese or Meat): "); //determine if user requested a "meat" or "cheese" pizza, echo the response then set variable values in the sub-classes
		String choice = input.nextLine();
		CWPizza eatable = null;

		if (choice.equalsIgnoreCase("Cheese")) {
			eatable = new CWCheese();
			System.out.println(eatable);
		} // end if

		else if (choice.equalsIgnoreCase("Meat")) {
			CWPizza l = new CWPizza();
			l.setCrust();
			l.setIngredient();
			System.out.println(l);
		} // end else if

	} // end main

} // end CWUnit5Ch14
