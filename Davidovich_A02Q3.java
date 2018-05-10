/**
 * Created by Mike Davidovich on 7/5/16.
 * Last modified 7/5/2016.
 */

import java.util.Random;
import java.util.Scanner;

public class Davidovich_A02Q3 {

    /*
    Tthis program asks users how many dice to roll, calcualtes the sum of all the rolled dice,
    and asks users for a value to add to the total of the rolled dice.  If 0 dice are rolled, the
    program will still calculate the addition to the result of 0, even if the final output is 0.
     */

    public static void main(String[] args) {

        int numDice, addToResult, count = 1, sum_dice = 0, final_result;    // Intiatlizes variables.

        Random die = new Random();                                          // Random die object

        Scanner scan = new Scanner(System.in);

        System.out.print("How many dice would you like to roll? ");         // Gathers user input.
        numDice = scan.nextInt();
        System.out.println();

        System.out.print("What should be added to the result? ");
        addToResult = scan.nextInt();
        System.out.println();

        if (numDice == 0){                                                  // Output for 0 dice rolled.
            final_result = addToResult;
            System.out.println("The sum of rolling " + numDice + "D6+" + addToResult +
                " is " + final_result + "."); }
        else {
            while (count <= numDice){                                       // Creates a random die roll
                sum_dice = sum_dice + (die.nextInt(6) + 1);                 // for number of dice rolled
                count++;}                                                   //  and adds to total

            final_result = sum_dice + addToResult;
            System.out.println("The sum of rolling " + numDice + "D6+" + addToResult +
                " is " + final_result + "."); }
    }
}
