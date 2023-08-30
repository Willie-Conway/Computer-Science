
/**************************************************************************************************
* CWSaleCheck.java
* Willie Conway
*
* This program is the Sales Checker class file. The sales object stores the sale in 2 in stance variables,
* dollars and cents, and includes a string variable to hold the error, which is initialized with the null.
*
* The CWSaleCheck Constructer receives sale as string, performs error checking to ensure time was enter in
* proper format to include a color (.) between the dollars and cents and a $ at start of the string. It uses
* sale.indexOf and sale.substring to seperate the sale string into the appropiate instance variables. It uses try/catch
* to catch format errors of dollars and cents.It uses the print numeric method and the print alphabetic method
* to ditribute the format of using both dollars and cents instance variables.
* Then uses the getError method to return the error instance variable to the print method.
***************************************************************************************************/

public class CWSaleCheck {
    private int dollars; //member to store dollar value
    private int cents; //member to store cents value
    private String errorString; //error string if any check fails

    /*Constructor for SaleCheck*/
    public CWSaleCheck(String sale) throws Exception{
        errorString = null; //Initialise with null
        try {
            //Check if $ is present at front
            if(sale.charAt(0) != '$') {
                errorString = "Invalid sale format missing \"$\" - " + sale;
            } else {
                //Check if . is present in sale string
                if(!sale.contains(".")) {
                    errorString = "Invalid sale format missing \".\" - " + sale;
                } else {
                    //extract dollar string
                    String dollarString = sale.substring(1, sale.indexOf('.'));
                    //extract cent string
                    String centString = sale.substring(sale.indexOf('.') + 1, sale.length());
                    try {
                        //this will throw numberFormatExecption if dollar value is not integer
                        dollars = Integer.parseInt(dollarString);
                    } catch(NumberFormatException ex) {
                        errorString = "Invalid dollar format - For input string: \"" +  dollarString + "\"";
                    }

                    try {
                        //this will throw numberFormatExecption if cent value is not integer
                        cents = Integer.parseInt(centString);
                        if(cents >= 100) {
                            errorString += "Invalid cent format - For input string: \"" +  centString + "\"";
                        }
                    } catch(NumberFormatException ex) {
                        if( errorString != null)
                            errorString += "\nInvalid cent format - For input string: \"" +  centString + "\"";
                        else
                            errorString = "Invalid cent format - For input string: \"" +  centString + "\"";
                    }
                }
            }
        } catch(Exception ex) { //throw any unchecked exceptions
            throw ex;
        }
    }

    public void printNumeric() {
        String output = String.format("$%d.", dollars);
        if(cents < 10) {
            output += String.format("%d0", cents); //append 0 if cent value is < 10
        } else {
            output += String.format("%d", cents);
        }
        System.out.println(output);
    }

    public void printAlphabetic() {
        System.out.println(dollars + " dollars and " + cents + " cents");
    }

    public String getError() {
        return errorString;
    } 
    // end main
}
// end class CWSaleCheck