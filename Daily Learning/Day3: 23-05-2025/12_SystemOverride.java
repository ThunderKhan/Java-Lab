import java.util.Scanner;

public class MissionJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System state: Manual override is globally disabled
        boolean overrideEnabled = false;

        // Secret clearance code for Commander only
        String securityCode = "SEC-ZAIK07";

        // Prompt user
        System.out.print("Do you want to control the system manually (true/false): ");
        String userInput = input.nextLine();

        System.out.println();

        // Check for secret commander access
        if (userInput.equals(securityCode)) {
            System.out.println("🔓 Commander override detected.");
            System.out.println("✅ Access granted. Manual control initiated. Welcome, Commander Khan.");
        
        } else if (userInput.equalsIgnoreCase("true")) {
            // Normal user requesting manual control
            if (overrideEnabled) {
                System.out.println("✅ Manual override accepted. Transitioning to manual control in T-10 seconds...");
            } else {
                System.out.println("⛔ Access Denied. Manual override is disabled. All systems remain on autopilot.");
            }

        } else if (userInput.equalsIgnoreCase("false")) {
            // Normal user accepts autopilot
            System.out.println("🛰️ Autopilot confirmed. Maintaining current course.");
        
        } else {
            // Invalid input
            System.out.println("⚠️ Invalid input. Please enter 'true', 'false', or valid clearance code.");
        }

        input.close();
    }
}
