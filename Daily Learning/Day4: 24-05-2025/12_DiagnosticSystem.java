import java.util.Scanner;

public class DiagnosticSystem {
    public static void main(String[] arg){
      Scanner input = new Scanner(System.in);
        String userMenuChoice;

        do {
            System.out.println("\n--- Diagnostic System Menu ---");
            System.out.println("1. Scan Hull");
            System.out.println("2. Run AI Diagnostics");
            System.out.println("3. Check Reactor core");
            System.out.println("Type 'exit' to Terminate");

            System.out.print("\nEnter your choice: "); 
            userMenuChoice = input.nextLine().trim().toLowerCase();

            String choiceMessage = switch(userMenuChoice) {
                case "1" -> "Scanning Hull integrity...";
                case "2" -> "Running AI Diagnostics...";
                case "3" -> "Checking Reactor core status...";
                case "exit" -> {
                    String exitMessage = "Terminating Diagnostic System. Goodbye!";
                    yield exitMessage;
                }
                default -> "Invalid choice. Please try again.";
            };

            System.out.println("Task in progress... Please wait.");
            try {
                Thread.sleep(10000); // Simulate a delay for the task
            } catch (InterruptedException e) {
                System.out.println("An error occurred during the task execution.");
            }

            System.out.println("\n\nTask completed, Full summary reported in logs\n" + choiceMessage);
            System.out.println("--------------------------------------------------");

        } while(!userMenuChoice.equals("exit"));
    }
}
