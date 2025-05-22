// P1: Ask user how many liters of fuel they have. Multiply it by 12 to find how far their ship can go (assuming 12 Light year/l). Print the result.

import java.util.Scanner;

public class FuelCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the System Control Panel");
        System.out.println("+--------------------------------+");
        System.out.println("|      MISSION STATUS PANEL      |");
        System.out.println("+--------------------------------+");
        System.out.println("| FUEL CELLS        [██████░░░░] |");
        System.out.println("| SHIELD INTEGRITY  [████████░] |");
        System.out.println("| CORE TEMP         [  83 °C ]   |");
        System.out.println("| NAV SYSTEMS       [ ONLINE  ] |");
        System.out.println("| DOCK STATUS       [ SEALED  ] |");
        System.out.println("+--------------------------------+");

        // Ask for fuel details
        System.out.print("How many liters of fuel do you have: ");
        int fuelLitres = input.nextInt();
        input.nextLine();

        // Calculate the distance capacity
        int distance = fuelLitres * 12;

        // printing the result
        System.out.println("With " + fuelLitres + " Litres of fuel, The Ship would go for about " + distance + " Light years.");
    }

}
