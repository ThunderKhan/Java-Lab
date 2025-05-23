import java.util.Scanner;

public class MissionJava {
    public static void main(String[] args) {
        
        // Creating a scanner Object
        
        Scanner input = new Scanner(System.in);
        
        // Ask the user for oxygen level
        
        System.out.print("Eneter current Oxygen leve: ");
        int oxygenLevel = input.nextInt();
        
        // Control flow for Oxygen Level
        
        if (oxygenLevel < 20) {
            System.out.println("Oxygen level is low!");
        } else {
            System.out.println("Oxygen level optimal");
        }
        
        // close the Scanner
        input.close();
    }
}
