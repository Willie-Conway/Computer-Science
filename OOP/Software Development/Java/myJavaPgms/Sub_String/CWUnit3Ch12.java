/***********************************************************************************
* CWUnit3Ch12.java
* Willie Conway
*
* This program gets input for a string, then will output a substring of the string
* character by character showing the upper case, lower case, initial case, binary,
* and hex values of each character.
***********************************************************************************/

import java.util.Scanner;

public class CWUnit3Ch12
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string of any length: "); //Task for user.
        String userInput = scanner.nextLine();
        System.out.println("\nInitial  ASCII(char)      ASCII(int)       Hex");
        // Header information for output.
        for (int i = 0; i < userInput.length(); i++) // User inputs text, anylength.
        {
            char inputtedText = userInput.charAt(i);

            if (Character.isDigit(inputtedText))
            // If the input is a digit, output the following information.
            {
                System.out.format("%c%25s%-3d%14s%-3s\n", inputtedText," ",
                (int)inputtedText," ", Integer.toHexString(inputtedText).toUpperCase());
            }

            else
            // If the input is NOT a digit, output the following information.
            {
                System.out.format("%c%8s%-3d%31s%-3s\n", inputtedText," ",
                (int)inputtedText," ", Integer.toHexString(inputtedText).toUpperCase());
            }
        }
        System.out.println("\nThank you for playing!"); // Last line shown.
    }
} // end CWUnit3Ch12 class