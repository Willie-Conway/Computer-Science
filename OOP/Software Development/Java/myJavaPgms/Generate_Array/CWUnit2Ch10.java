/***************************************
 * CWUnit2Ch10.java
 * Willie Conway
 *
 * This program declares an array list to hold and generate
 * random numbers between 1 and 100, gets input for how many
 * random numbers to use then allows you to number and search for
 * matching values. Then prints output for a sorted and
 * unsorted list.
 ***************************************/
import java.util.*;

public class CWUnit2Ch10 {

    static int pick;

    public static void main(String[] args) {

        System.out.print("How man random numbers between 1 and 100: ");

        ArrayList < Integer > randomArrayList = new ArrayList < > (); // Creates the ArrayList

        Scanner in = new Scanner(System.in);

        Random rand = new Random(); // Gets the random numbers

        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            pick = rand.nextInt(100);
            randomArrayList.add(pick); // Puts the random numbers into the ArrayList for each
        }

        System.out.print("Which number are you searching for?: ");
        int searchInt = in .nextInt();

        boolean containsValue = randomArrayList.contains(searchInt);
        if (containsValue) {
            System.out.println(" Unsorted list");
        }

        for (int y : randomArrayList) {
            if (y == searchInt)
                System.out.println(searchInt + " found at location: " + randomArrayList.indexOf(searchInt));

        }


        Collections.sort(randomArrayList);; // sort the ArrayList


        boolean containsValue2 = randomArrayList.contains(searchInt);
        if (containsValue2) {
            System.out.println(" Sorted list");
        }

        for (int x : randomArrayList) {
            if (x == searchInt)
                System.out.println(searchInt + " found at location: " + randomArrayList.indexOf(searchInt));

        }

        int sum = 0;
        for (int i = 0; i < randomArrayList.size(); i++) {
            sum = sum + i;
        }

        System.out.println("Total of all numbers:" + sum); //Prints the total of the ArrayList

    }
}