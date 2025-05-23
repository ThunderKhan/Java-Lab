import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter reactor temperature
        System.out.print("Enter reactor temperatrure: ");
        double reactorTemperature = input.nextDouble();

        // Control flow to decide the action based on temperature.
        if (reactorTemperature > 800) {
            System.out.println("CRITICAL: Reactor meltdown imminnent!");
        } else if (reactorTemperature >= 600 && reactorTemperature <= 800) {
            System.out.println("Stable. Monitor Fluctuations.");
        } else {
            System.out.println("System cold. Efficiency sub-optimal.");
        }

        // Close the scanner
        input.close();
    }
}
