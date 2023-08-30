/***********************************************************************************
* CWCheese.java
* Willie Conway
*
* This is the Cheese class for Pizza driver.
* This program sets the type to cheese via the constructor body.
* setCrust() - (notice this is different from LiFiPizza setCurst method)
* Automatically set it to "Thin" crust, no option to change, sorry.
*
***********************************************************************************/


public class CWCheese extends CWPizza {

	public CWCheese() {
		setType("Cheese");
		setCrust();
	}

	@Override
	public String toString() {
		return "\nYou ordered:\n" + getType() + " pizza\n" + getCrust()
				+ " crust\n" + "Total cost of $"
				+ String.format("%.2f", getCost());
	}

} // end CWCheese
