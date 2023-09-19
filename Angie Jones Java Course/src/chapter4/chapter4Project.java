package chapter4;

import java.util.Random;
import java.util.Scanner;

public class chapter4Project {

    public static void main(String args[]){

        //Introduction:
        System.out.println("Welcome to the most exciting game ever.");
        System.out.println("You are going to roll a dice, that you cant even see, nor influence.");
        //System.out.println("Its basically like playing UNO.");
        //System.out.println("If you like UNO ... Your an idiot. Sorry not sorry.;
        System.out.println(":)");
        System.out.println("Your exciting task is to reach exactly 20 Points.");
        System.out.println("...");
        System.out.println("I can see you little smartass trying to figure out a good strategie.");
        System.out.println("Bad news: There is non.");

        //Initialize what we know
        int numberOfSpaces = 20;
        int numberOfRolls = 5;

        //Dice Loop
        int diceTotal = 0;
        int rollsCounter = 0;

        for (int i = 1; i <= numberOfRolls; i++) {

            //Ask user if he/she is ready to throw the dice
            System.out.println("Are you ready to throw the dice? Answer with true/false.");

            Scanner scanner = new Scanner(System.in);
            boolean diceThrow = scanner.nextBoolean();

            //Exit if the user says no
            if (!diceThrow) {
                System.out.println("Sorry, you have lost.");
                System.out.println("And your ugly.");
                break;
            }

            //Generate output and calculate total
            else {

                //Count the amount of times the dice has been thrown
                rollsCounter = rollsCounter +1;

                //Dice
                Random random = new Random();
                int diceResult = random.nextInt(6) + 1;

                //Test runs:
                //int diceResult = 5;

                diceTotal = diceTotal + diceResult;

                System.out.println("You got a " + diceResult);

                    //Exit in case of winning
                    if(diceTotal == numberOfSpaces) {
                        System.out.println(numberOfSpaces + " Points!");
                        System.out.println("Congrats! You have won.");
                        break;
                    }

                    //Exit at too many Spaces
                    else if(diceTotal > numberOfSpaces){
                        System.out.println(diceTotal + " Points.");
                        System.out.println("You flew to close to the sun. You have lost.");
                        break;
                    }

                    //Continue with the loop
                    else{
                        System.out.println("You advanced to " + diceTotal);
                    }
                }
        }

        //Output after 5 rolls and too little spaces
        if(diceTotal < numberOfSpaces && rollsCounter == numberOfRolls){
            int spacesMissing = numberOfSpaces - diceTotal;
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("You advanced " + spacesMissing + " spaces to little.");
            System.out.println("You have lost.");
        }

    }
}
