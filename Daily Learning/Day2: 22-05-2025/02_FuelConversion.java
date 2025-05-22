// A simple program to demonstrate type conversion in Java.

public class fuelConversion {
    public static void main(String[] args) {
        // Widening of data
        int fuel = 100;
        double fuelUsed = fuel;

        System.out.println(fuel + " L");
        System.out.println(fuelUsed + " L");

        // Narrowing of data
        double signalStrength = 87.74;
        int newSignalStrength = (int) signalStrength;

        System.out.println(signalStrength + " Hz");
        System.out.println(newSignalStrength + " Hz");
    }
}
