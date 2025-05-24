import java.util.Scanner;

public class OxygenVent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String statusAtmosphericPressure;

        do {
            System.out.print("Releasing oxygen vents...");
            try {
                Thread.sleep(2500);
                } catch (InterruptedException e) {
                    System.out.println("An error occurred while releasing oxygen vents.");
                }
            System.out.print("\n\nIs Atmospheric Pressure Stable? (yes/no): ");
            statusAtmosphericPressure = input.nextLine().trim().toLowerCase();
            } while (!statusAtmosphericPressure.equals("yes"));
        
        System.out.println("Oxygen Systems Stabilized.");

        input.close();
    }
}
