
/**************************************************************************************************
* CWUnit6Ch15.java
* Willie Conway
*
* This program is a driver for the CWSaleCheck.java file (Sales Checker class File).
* The Driver class loops until “q” is entered to quit, If enter is not “q”, then it creates
* an instance of the CWSaleCheck object passing the entry as an argument.If no error, it Prints
* amount by calling: print numeric from  the CWSaleCheck class and print alphabetic from CWSaleCheck class.
* if error, it then prints an error message.
***************************************************************************************************/
import java.util.Scanner;

public class CWUnit6Ch15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        /*Enter the infinite loop*/
        while(true) {
            System.out.print("Please enter amount of sale in form $#.## (\"q\" to quit): ");
            //ask for user input
            userInput = scanner.next();
            if( userInput.equals("q")) { //If user enters 'q' then terminate the loop
                break;
            } else {
                try {
                    //create SaleCheck object
                    CWSaleCheck saleCheck = new CWSaleCheck(userInput);
                    //check if any error has occurred
                    if(saleCheck.getError() == null) {
                        //If no error then print numeric and alphabetic values
                        saleCheck.printNumeric();
                        saleCheck.printAlphabetic();
                    } else {
                        /*If getError() returns a non null value
                         *it means sale string is malformed
                         *print error */
                        System.out.println(saleCheck.getError());
                    }
                } catch (Exception ex) { //Catch any unknown exception
                    System.out.println("Unknown exception");
                }

            }
            System.out.println();
        }
    }
}
