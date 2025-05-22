// P4: Ask for total oxygen in liters and crew members. Each member uses 2L per hour. How many hours until oxygen runs out?

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {

        // Creating a scanner object.
        Scanner input = new Scanner(System.in);

        // Declare variables.
        double oxygenLeft, hours;
        int crewMembers;

        // Prompt the user to ask for size of crew and amount of oxyen left
        System.out.print("Number of crew members on board: ");
        crewMembers = input.nextInt();

        System.out.print("Amount of Oxygen left: ");
        oxygenLeft = input.nextDouble();

        // Calculating number of hours until oxygen runs out.
        hours = oxygenLeft / (crewMembers * 2);

        // Printing the result.
        System.out.println("Oxygen will run out in: " + hours + " hours!");
        System.out.println("Restart the air filter quickly!");

    }
}
