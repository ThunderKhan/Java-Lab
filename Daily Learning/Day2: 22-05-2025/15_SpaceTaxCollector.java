// Space Tax Calculator
// Ask for salary.
// If salary > 10,000, apply a 12% tax.
// If between 5,000 and 10,000 → 8% tax.
// Otherwise, 0% tax.

import java.util.Scanner;

public class SpaceTaxCollector {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Prompt user for their salary data.
        System.out.print("Enter your monthly salary: ");
        double salary = input.nextDouble();

        // Converting boolean to int.
        int isHigh = salary > 10000 ? 1 : 0;
        int isMid = (salary > 5000 && salary <= 10000) ? 1 : 0;

        // Calculate Tax rate, if both false → taxRate = 0
        double taxRate = isHigh * 0.12 + isMid * 0.08;

        // Calulate tax
        double tax = taxRate * salary;

        // Print the result
        System.out.println("Your space tast is $" + tax);

        // Close the scanner.
        input.close();
    }
}
