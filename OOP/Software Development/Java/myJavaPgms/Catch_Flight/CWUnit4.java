/* Willie Conway
 * CWUnit4.java
 * 
 * This program determines when you should head
 * to the airport for an upcoming flight.
 */



import java.util.Scanner;

/*
* Class that demonsrates the use of logical operators and
* loops.

*/
public class CWUnit4 {

    public static void main(String[] args){
        String dayOfFlight = "Monday"; //Initialise with random day
        String currentDay = "Monday"; //Initialise with random day
        int hoursOfFlight = 0;
        int currentHour = 0;
        boolean askForDayOfFlight = true;
        /*scanner object for reading user input*/
        Scanner scanner = new Scanner(System.in);

        /*Keep asking the user until day of flight is not same as
        * current day.
        */
        do {
            /*Don't ask flight day if already been asked*/
            if(askForDayOfFlight) {
                /*ask user for day of flight*/
                System.out.print("What is the day of your flight (Monday-Sunday): ");
                dayOfFlight = scanner.next();
                /*ask user for hours of flight*/
                System.out.print("What hour does your fligt leave (Military Time): ");
                hoursOfFlight = scanner.nextInt();
            }
            /*ask user for current day*/
            System.out.print("\nWhat is the current Day (Monday-Sunday): ");
            currentDay = scanner.next();

            if(!dayOfFlight.equalsIgnoreCase(currentDay)) {
                System.out.println("Today isn't your day for a flight, keep checking");
                askForDayOfFlight = false;
            }
            else {
                int hourDiff;
                int choice;
                /*ask user for current hour*/
                System.out.print("What is the current hour (Military Time): ");
                currentHour = scanner.nextInt();
                /*calculate the hour difference*/
                hourDiff = hoursOfFlight - currentHour;
                System.out.println("\nYou have " + hourDiff + " hours to go.");
                switch (hourDiff) {
                    case 1:
                        System.out.println("You best be at the airport, securty lines are long.");
                        break;
                    case 2:
                        System.out.println("Hope you are at the airport.");
                        break;
                    case 3: case 4:
                        System.out.println("Better be heading to the airport.");
                        break;
                    case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17:
                        System.out.println("Plenty of time, no need to rush.");
                        break;
                    case 18: case 19: case 20: case 21: case 22: case 23:
                        System.out.println("Are you seriously checking this early?");
                        break;
                    default:
                        System.out.println("Hopefully you made your flight.");
                        break;
                }
            }
        } while( !dayOfFlight.equals(currentDay) );

        System.out.println("\nThanks for planning your trip with us.");
    } // end main
} 
// end class CWUnit4
