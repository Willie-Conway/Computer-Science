/***********************************************************************************
* CWPizza.java
* Willie Conway
*
* This abstract class describes Pizza.
* This program uses a default constructor should set pizzaType to Meat and cost to $5
* setCrust()
* Call setCrust and allow selection of Thin or Thick crust
* setIngredients() function
* and allow for only 1 ingredient setCost()
* add $2 to the initial cost which is $5
* Include accessor methods as needed.
* Ensure all instance variables are private
*
***********************************************************************************/



import java.util.Scanner;

public class CWPizza {

	private String type;
	public String crust;
	private String ingredient;
	private double cost;

	public CWPizza() {
		type = "Meat";
		cost = 5.00;
	}

	// Getters and Setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust() {

		if (this instanceof CWCheese) {
			crust = "Thin";
		} else {
			System.out.print("Thin or Thick Crust ? ");// asks user to choose crust preference
			Scanner input = new Scanner(System.in);
			crust = input.nextLine();
		}
	}

	// setIngredent function

	public void setIngredient() {
		Scanner input = new Scanner(System.in);
		System.out.print("What ingredient, sorry, only 1: "); // asks user to pick one ingredint
		ingredient = input.nextLine();
		setCost();
	}

	// Getter and Setters

	public String getIngredient() {
		return ingredient;
	}

	public double getCost() {
		return cost;
	}

	public void setCost() {
		this.cost = cost + 2;
	}

	public String toString() {
		return "\nYou ordered:\n" + getType() + " pizza\n" + ingredient
				+ " (+$2.00)\n" + getCrust() + " crust\n" + "Total cost of $" //sums up the total cost of pizza ordered
				+ String.format("%.2f", getCost());
	}

}
