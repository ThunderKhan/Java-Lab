import java.util.Scanner;

public class DoorLock {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int doorPassword;
        
        do {
            System.out.print("Enter the Password: ");
            doorPassword = input.nextInt();

            if (doorPassword != 983451) {
                System.out.println("Door Locked. Try Again.");
            }

        } while (doorPassword != 983451);

        System.out.println("Access Granted! Door Unlocked.");

        input.close();
    }
}
