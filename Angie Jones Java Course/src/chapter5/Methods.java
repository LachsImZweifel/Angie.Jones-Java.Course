package chapter5;

import java.util.Scanner;

/*
OUR FIRST METHOD
Write a method that asks a user for their name, then greets them by name.
 */
public class Methods {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
