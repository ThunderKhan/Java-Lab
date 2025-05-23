import java.util.Scanner;

enum MissionPhase {
    PRELAUNCH, LAUNCH, ORBIT, REENTRY, LANDING
}

public class MissionControl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current Mission Phase: ");
        String missionPhase = input.nextLine().toUpperCase();

        MissionPhase phase = MissionPhase.valueOf(missionPhase);

        String message = switch (phase) {
            case PRELAUNCH -> "Checklist underway. Preparing for ignition.";
            case LAUNCH -> "Engines firing. Liftoff in progress!";
            case ORBIT -> {
                String altitude = "Altitude stable at 400km.";
                String note = " Enjoy the view!";
                yield altitude + note;
            }
            case REENTRY -> "Heat shields active. Commencing atmospheric reentry.";
            case LANDING -> "Landing gear deployed. Touchdown imminent.";
        };

        System.out.println(message);
        input.close();
    }
}
