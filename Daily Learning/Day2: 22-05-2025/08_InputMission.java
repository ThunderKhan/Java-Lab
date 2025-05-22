import java.util.Scanner;

public class InputMission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ASCII ART FOR AESTHETICS
        System.out.println("   _____       _        _         ___   ___   ___   _   _ ");
        System.out.println("  / ____|     | |      (_)       |__ \\ / _ \\ / _ \\ | \\ | |");
        System.out.println(" | (___   __ _| |_ _ __ _  ___      ) | | | | | | ||  \\| |");
        System.out.println("  \\___ \\ / _` | __| '__| |/ _ \\    / /| | | | | | || . ` |");
        System.out.println("  ____) | (_| | |_| |  | |  __/   / /_| |_| | |_| || |\\  |");
        System.out.println(" |_____/ \\__,_|\\__|_|  |_|\\___|  |____|\\___/ \\___(_)_| \\_|");
        System.out.println();
        System.out.println(" -=[ SOLARIS-90 MISSION CONTROL ]=- ");
        System.out.println(" >>> SYSTEM BOOTING... PLEASE WAIT <<< ");
        
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500); // Half second delay
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("SYSTEM INTERRUPTION DETECTED!");
        }

        System.out.println();

        // Taking name input
        System.out.print("Enter your name, commander: ");
        String name = input.nextLine();

        // Printing the results.
        System.out.println("Welcome on board commander " + name + ", we are ready for launch!");

        input.close(); // optional good habit
    }
}
