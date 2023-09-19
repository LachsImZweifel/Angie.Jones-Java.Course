package chapter5;

/*
VARIABLE SCOPE
Write an 'instant credit check' program that approves
anyone who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.

EXPLANATION:
Methods are different branches in a program.
The 'main' method (body) is used to control the flow of the program.
There can be a flow of information between the body of the program and the different methods.
In order to have variables, all methods have access to,
they need to be global variables instead of local variables.
This means they are declared in the scope of the class, not inside the scope of a method.


                public static boolean isUserQualified(int creditScore, double salary){
                        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
                            return true;
                        }
                        else{
                            return false;
                        }

The declaration 'boolean' determines that the return of the method 'isUserQualified' is a boolean value,
so its either true or false. You always need to define which kind of value is returned
or if there is no value returned (void).
A method can only return one value!
Regarding the name it is common to use a verb first and optionally a noun or adjective following.
Inside the braces after the name, the method is giving access to certain information not given in its scope.
In a method that returns a value, you need to state which value is returned by using the 'return' operator.
 */

import java.util.Scanner;

public class VariableScope {

    //Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){

        //Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if(isQualified) {
            System.out.println("Congrats! You have been approved.");
        }
        else{
            System.out.println("Sorry. You have been declined.");
        }
    }
}
