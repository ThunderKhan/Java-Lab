// A simple java program to calculate simple interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        //Creating a scanner object
        Scanner input = new Scanner(System.in);


        // Declaring Variables
        double principal, rate, time, simpleInterest;

        // Asking user for input
        System.out.print("\n\nEnter Princiapal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter interest rate: ");
        rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        time = input.nextDouble();

        // Calculating simple interest.
        simpleInterest = (principal * rate * time) / 100;

        // Print the simple interest
        System.out.println("\n\nYour total interest on the borrowed amount is $" + simpleInterest);
        System.out.println("Total payable amount is: $" + (simpleInterest + principal));

        input.close();
    }
}
