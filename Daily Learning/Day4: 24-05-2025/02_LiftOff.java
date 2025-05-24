import java.util.Scanner;

public class LiftOff {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Start the Launch Sequence? (yes/no): ");
        String launchResponse  = input.nextLine();

        System.out.print("Enter security code: ");
        String launchSecurityCode = input.nextLine();

        if (!launchResponse.equalsIgnoreCase("yes") || !launchSecurityCode.equalsIgnoreCase("SEC-ZAIK-42")) {
            System.out.println("Launch sequence aborted.");
            return;
        }

        int countDown = 10;
        System.out.println("Security code verified.");
        System.out.println("Welcome commander Khan!");
        System.out.println("Launch sequence initiated.");
        System.out.println("LAUNCH IN");
        while (countDown > 0) {
            System.out.print("\nT-minus " + countDown + "... ");
            
            try {
                Thread.sleep(1000); // Wait for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
                return; // Exit if something goes wrong
            }
            countDown--;
        }
        System.out.println("\n\nLiftoff!");

        input.close();
    }
}
