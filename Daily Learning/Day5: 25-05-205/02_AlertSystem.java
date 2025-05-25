public class AlertSystem {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            alertPilot();
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Sleep interrupted: " + e.getMessage());
            }
        }
    }

    static void alertPilot() {
        System.out.println("WARNING: Radiation storm detected near the atmosphere layer. Seek Shelter!");
    }
}
