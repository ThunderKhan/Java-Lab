import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for ship diagonistics
        System.out.print("Enter ship's shield Status (0-100): ");
        int shields = input.nextInt();

        System.out.print("\nEnter ship's fuel status (0-100): ");
        int fuel = input.nextInt();

        // Control flow based on ship diagnostics
        if (shields > 70 && fuel > 70) {
            System.out.println("\nAll Systems go!");
        } else if (shields >=50 || fuel >= 50) {
            System.out.println("\nLaunch possible, but risky!");
        } else {
            System.out.println("\nLaunch is impossible! Reboot recommended.");
        }

        // Close the scanner
        input.close();
    }
}
