import java.util.Scanner;

public class SatellitePing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String satellitePing;
        int pingCount = 0;

        do {
            System.out.print("Pinging Earth Control... Awaiting ACK: ");
            satellitePing = input.nextLine().trim().toLowerCase();

            if (satellitePing.equals("-1")) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.println("Response received, Ping back to Earth Control");
            while (pingCount < 10) {
                System.out.println("Pinging Earth Control... Attempt " + (pingCount + 1));
                System.out.println("Packets frequency " + (pingCount * 1000) + "ms");
                pingCount++;

                try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("An error occurred while waiting for the response.");
            }
            
            }
                
            System.out.println("Ping complete. Total pings sent: " + pingCount);
            System.out.println("--------------------------------------------------");

            pingCount = 0; // Reset ping count for the next round

            } while (!satellitePing.equals("ack"));
            
        System.out.println("Link confirmed. Earth Command Online.");
        input.close();
    }
}
