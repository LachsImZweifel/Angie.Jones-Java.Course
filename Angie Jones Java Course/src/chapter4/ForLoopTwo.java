package chapter4;

import java.util.Scanner;

public class ForLoopTwo {

    public static void main(String args[]){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search for letter A
        for(int i=0; i<text.length(); i++){
        //2. Option
        //for(int i=0; letterFound = true || i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
        //2.Option: without "break"
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}