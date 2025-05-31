import java.util.Scanner;

public class WaterTankMonitor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the water level in percentage: ");
        double waterLevel = input.nextDouble();

        if (waterLevel >= 90) {
            System.out.println("Overflow risk!");
        } else if (waterLevel >= 50 && waterLevel < 90) {
            System.out.println("Safe Level!");
        } else if (waterLevel >= 20 && waterLevel < 50) {
            System.out.println("Low Water!");
        } else if (waterLevel < 20) {
            System.out.println("Danger! Low Water!");
        }

        input.close();
    }
}
