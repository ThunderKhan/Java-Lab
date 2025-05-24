import java.util.Scanner;

public class CommandOverride {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String overrideKey;

        do {
            System.out.print("Enter the override key: ");
            overrideKey = input.nextLine();
            System.out.println("Key Entered, processing...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("An error occured while processing, Please run System diagnostics.");
            }
            
            if (!overrideKey.equals("SOL90")) {
                System.out.println("Invalid key. Try again.");
            }
            } while (!overrideKey.equals("SOL90"));
        
        System.out.println("Override Accepted. Proceed with system repairs.");
        input.close();
    }
}
