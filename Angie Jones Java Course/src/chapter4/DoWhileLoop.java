package chapter4;

import java.util.Scanner;

/*
DO WHILE LOOP:

Exercise:
Write a program that allows a user to enter two numbers,
and then sums up the two numbers.The user should be able to
repeat this action until they indicate they are done.

Attributes:
1. Condition-controlled:
        Loop continues running while the specified condition remains true.
2. Post-test
        Condition is tested after completing the loop
3. Execution
        Best to use when the loop may or may not need to execute, based on the situation.
 */
public class DoWhileLoop {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Answer with: True/False");
            again = scanner.nextBoolean();

        } while(again);
    }
}
