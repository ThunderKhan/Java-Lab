import java.util.Scanner;

public class MissionJava {
    public static void main(String[] args) {
        
        // Create a scanner Object
        Scanner input = new Scanner(System.in);
        
        // Asking user for input
        System.out.print("Enter Power grid status (0-100): ");
        int powerStatus = input.nextInt();
        
        // Control flow for power status.
        if (powerStatus >= 80) {
            System.out.println("Green");
        } else if (powerStatus >= 50) {
            System.out.println("Yellow");
        } else {
            System.out.println("Red");
        }
        
        // Close the Scanner
        input.close();
    }
}
