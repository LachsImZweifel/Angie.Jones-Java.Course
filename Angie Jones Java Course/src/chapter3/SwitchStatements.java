package chapter3;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        System.out.println("Only capital letters allowed.");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Lunkhead!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

    }

}
