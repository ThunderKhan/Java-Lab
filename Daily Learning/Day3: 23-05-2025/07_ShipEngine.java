import java.util.Scanner;

enum EngineMode {
    OFFLINE, IDLE, CRUISE, BOOST
}

public class MissionControl {
    public static void main(String[] args) {
        
        // Create a Scanner object.
        Scanner input = new Scanner(System.in);
        
        // Ask for user input to select Engine Mode
        System.out.print("Select an Engine Mode (OFFLINE/IDLE/CRUISE/BOOST): ");
        String mode = input.nextLine().toUpperCase();
        
        // Equating value to enum.
        EngineMode engine = EngineMode.valueOf(mode);
        
        // Switch-casing on the engine mode.
        String message = switch(engine) {
            case OFFLINE -> "Main engines are offline. All propulsion systems in cold standby. Manual override required to initialize startup sequence.";
            case IDLE -> "Engines on idle. Maintaining thermal equilibrium and core readiness. Standing by for further instructions, Commander.";
            case CRUISE -> "Cruise mode engaged. Velocity stable. Trajectory locked to navigation path. Optimizing fuel-to-thrust ratio.";
            case BOOST -> {
                String engineStatus = "Boost mode activated. Channeling extra power to engines. Acceleration increasing—brace for inertial impact. Estimated burn duration: 22 seconds.";
                String fuel = "\n\nFuel consumption increased!";
                yield engineStatus + fuel;
            }
        };
        
        // Printing ouput
        System.out.println(message);
        
        // Scanner object closing
        input.close();
    }
}
