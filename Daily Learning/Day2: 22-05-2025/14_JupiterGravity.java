// P6: Input a weight in Earth kg and convert it to Jupiter weight (Jupiter's gravity ≈ 2.528x Earth). Use double for precision.

import java.util.Scanner;

public class JupiterGravity {
    public static void main(String[] args) {

        // Creating a scanner object.
        Scanner input = new Scanner(System.in);

        // Declare Variables.
        double earthWeight, jupiterWeight;

        // Prompting user to input their weight.
        System.out.print("Enter your weight as on Earth: ");
        earthWeight = input.nextDouble();

        // Calculating the weight on jupiter
        jupiterWeight = (earthWeight * 2.528);

        // Printing the result.
        System.out.println("Your weight on Jupiter is " + jupiterWeight + " kg");

        // Closing the scanner.
        input.close();
    }
}
