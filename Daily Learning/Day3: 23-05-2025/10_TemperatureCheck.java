import java.util.Scanner;

public class MissionJava {
    public static void main(String[] args) {
        
        // Create a scanner object.
        Scanner input = new Scanner(System.in);
        
        // Ask for temperature levels.
        System.out.print("Enter Temperature: ");
        double temperature = input.nextDouble();
        
        // Control flow for temperature.
        if (temperature > 80 || temperature < -20) {
            System.out.print("Temperature Critical!");
        } else {
            System.out.print("Temperature Normal!");
        }
        
        // Close the scanner.
        input.close();
    }
}
