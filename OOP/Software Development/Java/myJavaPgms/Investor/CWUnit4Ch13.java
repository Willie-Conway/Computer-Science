/**************************************************************************************************
* CWUnit4Ch13.java
* Willie Conway
*
* This program is the driver for the CWUnit4Ch13Investor.java program.It tracks an investment
* for 1 person based on an inputted investment rate, with an initial balance of $2000.
* It uses getBalance() to display the current balance and addInterest()
* to add in the monthly interest gains accrued
***************************************************************************************************/

import java.util.Scanner;


public class CWUnit4Ch13 {
    public static void main(String[] args) {
        /*create  investor1 a/c no 1001, balance $2000*/
        CWUnit4Ch13Investor investor1 = new CWUnit4Ch13Investor(1001, 2000);
        /*create  investor2 a/c no 2001, balance $4000*/
        CWUnit4Ch13Investor investor2 = new CWUnit4Ch13Investor(2001, 4000);
        /*get intereset rate from user*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the APR in the form of .05 for 5%: ");
        double interestRate = scanner.nextDouble();
        /*set interest rate in class variable*/
        CWUnit4Ch13Investor.setInteresetRate(interestRate);

        System.out.println("Monthly balance for one year with " + interestRate + " annual interest:\n");
        /*print report*/
        System.out.println("Month   Account #   Balance   Account #   Balance");
        System.out.println("-----   ---------   -------   ---------   -------");
        for(int i = 1; i <= 15; i++) {
            investor1.addInterest();
            investor2.addInterest();
            System.out.format("%5d%12d%10.2f%12d%10.2f\n", i, investor1.getAccountNumber(),
                    investor1.getBalance(), investor2.getAccountNumber(), investor2.getBalance());
        }
        /*print intereset earned by each investors*/
        System.out.println();
        System.out.format("Investor1 earned : %.2f interest in 15 months at %.2f%s\n", investor1.getBalance() - 2000, 100 * interestRate , "%");
        System.out.format("Investor2 earned : %.2f interest in 15 months at %.2f%s\n", investor2.getBalance() - 4000, 100 * interestRate , "%");
    } 
    // end main
}
// end class CWUnit4Ch13
