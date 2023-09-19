package chapter3;

import java.util.Scanner;

/*
NESTED IFS:
To qualify for a loan, a person must make at least $30,000 in a year
and have been working at their current job for at least 2 years.
(If the capital is more than 500000, they get a loan anyway.)
 */
public class LoanQualifier {
    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        //double requiredCapital = 500000;  (Muss in else-statement eingewoben werden)

        //Get what we don't
        System.out.println("Enter your salary of a year:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double yearsEmployed = scanner.nextDouble();

       /*
       System.out.println("Enter your Capital:");
        double capital = scanner.nextDouble();
        */
        scanner.close();


        //Make decision
        if(salary >= requiredSalary){
            if (yearsEmployed >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan.");
            }
            else{
                double yearsMissing = requiredYearsEmployed - yearsEmployed;
                System.out.println("Sorry, you must have worked at your current job for "
                + requiredYearsEmployed + " years.");
                System.out.println("We are happy to see you again in " + yearsMissing + " years!");
            }
        }
        else{
            if (yearsEmployed >= requiredYearsEmployed){
                System.out.println("Sorry, you must at least earn $" + requiredSalary + " in a year.");
            }
            else{
                System.out.println("Sorry, you must at least earn $" + requiredSalary
                + " in a year and must have worked at your current job for " + requiredYearsEmployed
                + " years, to get the loan.");
                }
        }
       /*
        if (capital >= requiredCapital)
            System.out.println("But you are a rich motherfucker! You qualify for the loan.");
        }
        */
    }

}
