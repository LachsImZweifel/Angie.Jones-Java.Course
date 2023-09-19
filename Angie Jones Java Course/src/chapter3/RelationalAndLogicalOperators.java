package chapter3;

import java.util.Scanner;

/*
RELATIONAL OPERATORS                    COMPARING STRINGS
>   greater than                        if(string1.equals(string2))             the same
<   less than                           if(!string1.equals(string2))            not the same
>=  greater or equal                    if(string1.equalsIgnoreCase(string2))   doesn't matter
<=  less or equal
==  equal
!=  not equal

LOGICAL OPERATORS
&&      AND     Both conditions must be true
||      OR      At least one condition must be true
!       NOT     Condition must be false
 */

public class RelationalAndLogicalOperators {
    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary of a year:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double yearsEmployed = scanner.nextDouble();

        scanner.close();


        //Make decision
        if(salary >= requiredSalary && yearsEmployed >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan.");
            }
        else{
                System.out.println("Sorry, in order to qualify for the loan, it's required to have a"
                + " years salary of $" + requiredSalary + " and you need to be with your"
                + " current employer for at least " + requiredYearsEmployed + " years.");
        }

    }

}
