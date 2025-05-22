// P2: Ask for the commander’s age. Multiply it by 365 / 28 to get how many lunar days they've lived.

import java.util.Scanner;

public class MoonAge {
    public static void main(String[] args) {

        // Creatting a scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Ask for user's age.
        System.out.print("\n\nEnter your age, commander: ");
        int userAge = input.nextInt();
        input.nextLine();

        // Calculate the moon age in days
        int moonAge = userAge * (365 / 28);

        // Print the moon age
        System.out.println("Your moon age is " + moonAge + " days!");

        // Close the scnanner
        input.close();
    }
}
