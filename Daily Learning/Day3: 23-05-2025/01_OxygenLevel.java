import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompting the user for the input on Oxygen Level.
        System.out.print("Enter the Oxyen Level: ");
        double oxygenLevel =  input.nextDouble();

        // Control flow for the Oxygen level.
        if (oxygenLevel < 20) {
            System.out.println("\nCRITICAL: Oxygen below survival threshold!");
        } else if (oxygenLevel >= 20 && oxygenLevel <= 50) {
            System.out.println("\nWARNING: Oxygen low, monitor closely.");
        } else {
            System.out.println("\nOxygen levels stable.");
        }

        // Close the scanner object
        input.close();
    }
}
