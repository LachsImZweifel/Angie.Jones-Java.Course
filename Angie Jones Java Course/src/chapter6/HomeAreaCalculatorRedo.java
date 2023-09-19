package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        /*
        This is used because the main method is always static in Java,
        but the RectangleCAO object is not static.
        A static class cant deal with non-static objects or methods.
        This is why you declare this something.
         */
        RectangleCAO kitchen = calculator.getRoom();
        RectangleCAO bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    public RectangleCAO getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new RectangleCAO(length, width);
    }

    public double calculateTotalArea(RectangleCAO rectangle1, RectangleCAO rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
