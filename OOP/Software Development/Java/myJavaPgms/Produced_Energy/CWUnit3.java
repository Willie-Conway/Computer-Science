
/********************************************************************************
* Willie Conway
*  CWUnit3.java
*
* This programs calculates savings, days to recoup cost and years to recoup cost.
********************************************************************************/

import java.util.Scanner;
import java.io.File;

public class CWUnit3 {
    public static void main(String[] args) throws Exception {
        double ELECTRICITY_COST = .085;
        double TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK = 498.4; // in kWh
        double TOTAL_SAVINGS_FOR_ONE_WEEK = 42.364000000000004;
        double SAVINGS_PER_DAY = 6.050000000000004;

        // Scanner stdIn = new Scanner (System.in) ;
        Scanner stdIn = new Scanner(new File("energyProduced.txt"));
        double totalDataOne; // energy produced data 1
        double totalDataTwo; // energy produced data 2
        double totalDataThree; // energy produced data 3
        double totalDataFour; // energy produced data 4
        double totalDataFive; // energy produced data 5
        double totalDataSix; // energy produced data 6
        double totalDataSeven; // energy produced data 7

        // System.out.print("Total System Cost:") ;
        totalDataOne = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataOne + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataOne));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataOne / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataOne / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataTwo = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataTwo + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataTwo));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataTwo / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataTwo / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataThree = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataThree + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataThree));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataThree / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataThree / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataFour = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataFour + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataFour));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataFour / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataFour / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataFive = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataFive + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataFive));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataFive / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataFive / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataSix = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataSix + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataSix));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataSix / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataSix / SAVINGS_PER_DAY) / 365) + '\n');

        // System.out.print("Total System Cost:") ;
        totalDataSeven = stdIn.nextDouble();
        System.out.println('\n' + "Sample below using" + " " + totalDataSeven + " " + "as input" + '\n');
        System.out.println("Total System Cost:" + '\t' + '\t' + '\t' + (ELECTRICITY_COST * totalDataSeven));
        System.out.println("Total Energy Produced in one week:" + '\t' + TOTAL_ENERGY_PRODUCED_IN_ONE_WEEK);
        System.out.println("Total Savings for one week:" + '\t' + '\t' + TOTAL_SAVINGS_FOR_ONE_WEEK + " " + "kWh");
        System.out.println("Savings per day:" + '\t' + '\t' + '\t' + SAVINGS_PER_DAY);
        System.out.println("Days to recoup cost (truncated):" + '\t' + (int) (totalDataSeven / SAVINGS_PER_DAY));
        System.out.println(
                "Years to recoup cost (truncated):" + '\t' + (int) ((totalDataSeven / SAVINGS_PER_DAY) / 365) + '\n');

    } // end main
} // end class CWUint3