public class LiftOff {
    public static void main(String[] args) {
        int countDown = 10;

        System.out.println("Launch in");
        while (countDown > 0) {
            System.out.print("\n\nT-minus " + countDown + "... ");
            
            try {
                Thread.sleep(1000); // Wait for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
                return; // Exit if something goes wrong
            }
            countDown--;
        }
        System.out.println("\n\n Liftoff!");
    }
}
