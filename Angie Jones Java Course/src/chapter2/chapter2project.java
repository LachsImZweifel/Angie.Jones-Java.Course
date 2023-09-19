package chapter2;

import java.util.Scanner;

public class chapter2project {
    public static void main(String arg[]){

        //1. Ask for a season of a year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask for a number
        System.out.println("Enter your favorite Number");
        int number = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Type in a very flowery adjective");
        System.out.println("See how I used >Flowery<, it not hard :)");
        String adjective = scanner.next();
        scanner.close();

        //4. Put out the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }

}
