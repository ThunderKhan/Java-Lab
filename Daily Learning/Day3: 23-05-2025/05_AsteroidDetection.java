import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // ASCII Art for the spaceship
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║      🚀 STARSHIP COMMAND CENTER - V1.0 🪐        ║");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.println("║ ENGINE: [■■■■■■■■■■■■■■■■■ ] 100%               ║");
        System.out.println("║ SHIELD: [■■■■■■■■■■■□□□□□ ] 70%                 ║");
        System.out.println("║ FUEL:   [■■■■■■■■■■■■■■□□ ] 85%                 ║");
        System.out.println("╠════════════════════ RADAR ═══════════════════════╣");
        System.out.println("║  +------+                                        ║");
        System.out.println("║  |  *   |  ∴ Asteroid Detected - Port Side       ║");
        System.out.println("║  |   ^  |  ∵ Enemy Signal - Stern                ║");
        System.out.println("║  +--+---+                                        ║");
        System.out.println("╠═════════════ NAVIGATION MAP (SECTOR 7G) ═════════╣");
        System.out.println("║ [*]→⊙───→✶───→☄                                    ║");
        System.out.println("║ You are here: *                                  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");

        // Prompt the user for Ship's speed and Shiled status.
        System.out.print("\n\nEnter the ship's speed (in km/h): ");
        double speed = input.nextDouble();

        System.out.print("Are the shields up? (true/false): ");
        boolean shieldsUp = input.nextBoolean();

        // Asteroid decision making 
        if (speed > 1000 && !shieldsUp) {
            System.out.println("\nIMPACT IMMINENT! Brace for damage!");
        } else if (speed > 1000 && shieldsUp) {
            System.out.println("\nShileds Holding! Maintain course.");
        } else {
            System.out.println("\nSafe speed. Proceed.");
        }
    }
}
