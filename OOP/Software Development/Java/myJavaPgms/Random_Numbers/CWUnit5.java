/*****************************************************************
*CWUnit5.java
*Willie Conway
*
*In this program random numbers for the user-entered number of
*rounds are generated, each round prints a random number, the random number
*raised to the power of the round, the module of the random number
*and the round, and the random number divided by the round.
******************************************************************/

import java.util.Scanner;

public class CWUnit5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

	String maxRandomNum; //user-input random number variable
	int maxRandomNumInt; //random number converted from string to integer variable
	int maxRounds;		 //user-input maximum number of rounds
	final String HEADER_FMT_STR = "%-10s%10s%15s%15s%15s"; //named constant for header format
	final String DATA_FMT_STR = "%5d%15d%,15d%15d%14.2f";  //named constant for data format

    // input max random as string and then extract
	System.out.print("Please enter the maximum random number to be used (2-8): ");
	maxRandomNum = keyboard.next();
	maxRandomNumInt = Integer.parseInt(maxRandomNum);

    // input validation of maximum random number limit integers between 2 and 8
    // just replace with 8 if invalid
	if (maxRandomNumInt <2 || maxRandomNumInt >8)
	{
	  System.out.println("Random larger than 8 entered, using max number of 8.\n");
	  maxRandomNumInt = 8;
	}

    // input maximum number of rounds
	System.out.print("Please enter the number of rounds (1-8): ");
	maxRounds = keyboard.nextInt();

    // input validation of maximum number of rounds limit between 1 and 8
    // just replace with 8 if invalid
	if (maxRounds <1 || maxRounds >8)
	{
	  System.out.println("Rounds larger than 8 entered, using max number of 8.");
	  maxRounds = 8;
	}
	System.out.print('\n');

    // print header
	System.out.printf(HEADER_FMT_STR,"Round","Rand #","Rand^Round","Modulus","Rand/Round\n");

    // loop to print maxRounds number of rounds, print 5 items in each round
	for (int round = 1; round <= maxRounds; round++)
	{
	  int randomNumber = (int)(Math.random()*maxRandomNumInt) + 1;
	  System.out.printf(DATA_FMT_STR, round, (int)randomNumber,
	                      (int) Math.pow(randomNumber, round),
	                      randomNumber % round,
	                      (double) randomNumber / round);
	  System.out.print('\n');
	}

	System.out.println("End Run..."); // final end run msg
  }//end main
}// end CWUnit5 class