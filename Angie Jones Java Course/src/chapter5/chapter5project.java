package chapter5;

import java.util.Scanner;

public class chapter5project {

    static double overageMinuteRate = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Get User information
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();

        //Calculate overage fees
        double overageFees = calcOverageFees(overageMinutes);

        //Get the total
        double taxes = calcTaxes(planFee, overageFees);

        //Calc Total and Print Bill
        printBill(planFee, overageFees, taxes);

    }
    public static double getPlanFee(){
        System.out.println("Enter your monthly fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static int getOverageMinutes(){
        System.out.println("Enter your overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double calcOverageFees(int overageMinutes){
        double overageFees = overageMinutes * overageMinuteRate;
        return overageFees;
    }
    public static double calcTaxes(double planFee, double overageFees){
        double taxes = (planFee + overageFees) * taxRate;
        return taxes;
    }
    public static void printBill(double planFee, double overageFees, double taxes){
        double total = planFee + overageFees + taxes;
        System.out.println("Cell phone bill:");
        System.out.println("Plan = $" + planFee);
        System.out.println("Overage = $" + overageFees);
        System.out.println("Taxes = $" + taxes);
        System.out.println("Total = $" + total);
    }
}
