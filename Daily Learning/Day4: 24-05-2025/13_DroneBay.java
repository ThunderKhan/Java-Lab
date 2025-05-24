import java.util.Scanner;

public class DroneBay{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password;
        int passwordAttempts = 0;

        do {
            System.out.print("Enter the Drone Bay access password: ");
            password = input.nextLine().trim();
            passwordAttempts++;
        } while (!password.equals("starlink") && passwordAttempts < 3);

        if (password.equals("starlink")) {
            System.out.println("Access granted to Drone Bay.");
            System.out.println("Drone Bay is now operational.");
        } else {
            System.out.println("\n\nAccess to Drone Bay denied.");
            System.out.println("You have exceeded the maximum number of attempts.");
            System.out.println("Drone Bay is now locked down for security.");
        }
    }
}
