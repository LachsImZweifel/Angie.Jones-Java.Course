package chapter6project;

import java.util.Scanner;

public class PhoneBillCalculator {

    private Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){

        PhoneBillCalculator calculator = new PhoneBillCalculator();

        Bill bill1 = calculator.getBill();

        System.out.println("Name: " + bill1.getName());
        System.out.println("Mobile number: " + bill1.getMobileNumber());
        System.out.println("Base cost: " + bill1.getBaseCost());
        System.out.println("Overage Minutes: " + bill1.calculateOverageMinutes());
        System.out.println("Cost per Minute: " + bill1.getCostPerMinute());
        System.out.println("Cost for overage minutes: " + bill1.calculateOverageMinutes() * bill1.getCostPerMinute());
        System.out.println("Subtotal: " + bill1.calculateSubtotal());
        System.out.println("Taxes: " + bill1.calculateTax());
        System.out.println("------------------");
        System.out.println("Total: " + bill1.calculateTotal());
        System.out.println(" ");
        System.out.println("Thank you for using PhoneBillCalculator!");

        calculator.scanner.close();
    }

    public Bill getBill(){

        System.out.println("Enter your first Name:");
        String firstName = scanner.next();

        System.out.println("Enter your last Name:");
        String lastName = scanner.next();

        String name = firstName + " " + lastName;

        System.out.println("Enter your mobile number:");
        String mobileNumber = scanner.next();


        System.out.println("Do you have your contract Details? (true/false)");
        boolean userHasContractInformation = scanner.nextBoolean();

        if(userHasContractInformation == false){
            return new Bill(name, mobileNumber);
        }

        else{

           System.out.println("Enter your contracts base cost per month:");
           double baseCost = scanner.nextDouble();

           System.out.println("Enter your contracts allotted minutes per month:");
           int allottedMinutes = scanner.nextInt();

           System.out.println("Enter your minutes used last month:");
           int minutesUsed = scanner.nextInt();

           System.out.println("Enter your contracts cost per overage minute:");
           double costPerMinute = scanner.nextDouble();

           return new Bill(name, mobileNumber, baseCost, allottedMinutes, minutesUsed, getBill().calculateOverageMinutes(),
                   costPerMinute, getBill().calculateSubtotal(), getBill().calculateTax(), getBill().calculateTotal());
       }
    }


}
