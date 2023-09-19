package chapter3;

/*
You just moved out and your parents gave you Money to invest in your apartment.
The program is giving you information if you stayed inside your budget
and how many beers you can get for your first party.
 */

import java.util.Scanner;

public class chapter3Project {
    public static void main(String args[]){

        //1. Values of the goods

            //Küchenequipment
        double cutleryPrice = 16.99;
        double stovePrice = 169;
        double fridgePrice = 149.99;
        double microwavePrice = 69;
        double dishwasherPrice = 202;

            //Möbel
        double diningTablePrice = 44;
        double chairsPrice = 20;
        double couchPrice = 179.99;
        double shoeCabinetPrice = 79.99;

        //Sonstige Elektronik
        double musicSystemPrice = 399.99;
        double tvPrice = 100;
        double washingMachinePrice = 317.99;

        //Bier
        double beerPrice = 1;


        //2. Ask for the amount of money received and the goods desired
        System.out.println("Welcome to: How much beer can I still afford?!");
        System.out.println("Lets start with the most important question...");

        System.out.println("How much money do you have, fellow beer enthusiast?");
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        if (budget < 200){
            System.out.println("Get serious, get a job!");
        }
        else if (budget < 500){
            System.out.println("Reasonable.");
        }
        else if (budget < 800){
            System.out.println("We can work with that.");
        }
        else if (budget < 1100){
            System.out.println("Somebody got rich parents.");
        }
        else{
            System.out.println("Dude just hire an architect...");
        }

        System.out.println("Anyways... Enter the amount of the following goods, you want to buy.");
        System.out.println("Enter a 0, if you don't want the item. No decimal Numbers possible.");

        System.out.println("Cutlery for $" + cutleryPrice);
        int cutleryAmount = scanner.nextInt();

        System.out.println("Stove for $:" + stovePrice);
        int stoveAmount = scanner.nextInt();

        System.out.println("Fridge for $" + fridgePrice);
        int fridgeAmount = scanner.nextInt();

        System.out.println("Microwave for $" + microwavePrice);
        int microwaveAmount = scanner.nextInt();

        System.out.println("Dish washer for $" + dishwasherPrice);
        int dishWasherAmount = scanner.nextInt();

        System.out.println("Dining table for $" + diningTablePrice);
        int diningTableAmount = scanner.nextInt();

        System.out.println("Chairs for $" + chairsPrice);
        int chairsAmount = scanner.nextInt();

        System.out.println("Couch for $" + couchPrice);
        int couchAmount = scanner.nextInt();

        System.out.println("Shoe cabinet for $" + shoeCabinetPrice);
        int shoeCabinetAmount = scanner.nextInt();

        System.out.println("Music system for $" + musicSystemPrice);
        int musicSystemAmount = scanner.nextInt();

        System.out.println("TV for $" + tvPrice);
        int tvAmount = scanner.nextInt();

        System.out.println("Washing machine for $" + washingMachinePrice);
        int washingMachineAmount = scanner.nextInt();

        scanner.close();

        Double spending = cutleryAmount * cutleryPrice + stoveAmount * stovePrice + fridgeAmount * fridgePrice
                + microwaveAmount * microwavePrice + dishWasherAmount * dishwasherPrice
                + diningTableAmount * diningTablePrice + chairsAmount * chairsPrice + couchAmount * couchPrice
                + shoeCabinetAmount * shoeCabinetPrice + musicSystemAmount * musicSystemPrice
                + tvAmount * tvPrice + washingMachineAmount * washingMachinePrice;

        //3. Tell them if they are inside their budget and how much they can spend more/less

        if (spending > budget){
            double overSpending = spending - budget;
            System.out.println("Sorry bro, no beer's for you. :(");
            System.out.println("Rather start working your ass of and save $" + overSpending + " more.");
        }


        else{
            if (spending < budget && budget - spending < 1){
                System.out.println("Good news: Your on point.");
                System.out.println("Bad news: Too broke for beer.");
                System.out.println("Feel free to run the program again. :)");
            }
            else{
                double savings = budget - spending;
                double beerAmount = savings / beerPrice;
                System.out.println("That's good work.");
                System.out.println("You can afford all your items and there is still enough left for "
                + beerAmount + " beers.");

            }
        }

    }
}
