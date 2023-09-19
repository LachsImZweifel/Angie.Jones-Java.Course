package chapter4;

import java.util.Scanner;

/*
FOR-LOOP

Exercise
Write a cashier program that will scan a given number of items and tally the cost.

Attributes:
1. Count-controlled
        Loops run a specific number of times
2. Pre-test
        Condition is tested before entering the loop
3. Execution
        Best to use when the loop may or may not need to execute, based on the situation
 */
public class ForLoop {
    public static void main(String args []){

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);

    }

}
