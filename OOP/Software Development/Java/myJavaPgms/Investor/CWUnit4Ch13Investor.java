
/**************************************************************************************************
* CWUnit4Ch13Investor.java
* Willie Conway
*
* This program provides and declares a constant called ACCOUNT_NUMBER
* Declares an instance variable called balance
* Provides a class method that will be used to set the annual interest rate
* Provides a two parameter constructor to initialize the constant account
* number and balance.
*
* Provides an addInterest() method to update the balance based on the
* interestRate entered in the driver.
* Add the interest using (balance * interestRate / 12).
*
***************************************************************************************************/

public class CWUnit4Ch13Investor {

    private static double interestRate;
    private final int  accountNumber;
    private double balance;

    public CWUnit4Ch13Investor(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setInteresetRate(double rate) {
        interestRate = rate;
    }

    public void addInterest() {
        this.balance += (this.balance * interestRate)/12;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    // end main

}
// end class CWUnit4Ch13Investor
