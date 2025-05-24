import java.util.Scanner;

public class TuneFreqeuncy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the frequency in Hz (or -1 to exit): ");
            double frequency = input.nextDouble();

            if (frequency == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Tuning to frequency: " + frequency + " Hz.");

            // Simulate tuning process
            try {
                Thread.sleep(2000); // Simulate a delay for tuning
            } catch (InterruptedException e) {
                System.out.println("Tuning interrupted.");
            }
            System.out.println(" Tuning complete.");
            System.out.println("You are now tuned to " + frequency + " Hz.");
        }

        input.close();
    }
}
