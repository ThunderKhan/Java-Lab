import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {
        
        // Create a java object.
        
        Scanner input = new Scanner(System.in);
        
        // Ask the user for role
        
        System.out.print("Enter your role: ");
        String role = input.nextLine().toUpperCase();
        
        // Switch casing the roles
        
        String message = switch (role) {
            case "COMMANDER" -> "Full access granted.";
            case "ADMIN" -> "Deck admin access granted.";
            case "CREW" -> "Limited access granted.";
            default -> "Acces denied.";
        };
        
        // Printing the output
        
        System.out.println(message);
    }
}
