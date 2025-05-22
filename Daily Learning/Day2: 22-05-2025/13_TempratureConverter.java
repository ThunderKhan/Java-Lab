// P5: Ask for a Celsius value and convert it to Fahrenheit.

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {


        // Creating a Scanner object.
        Scanner input = new Scanner(System.in);

        // Declaring variables.
        double Celsius, Fahrenheit;

        // Prompting user to enter temprature in celsius.
        System.out.print("\n\nEnter temprature in degree Celsius: ");
        Celsius = input.nextDouble();

        // Converting Celsius to Fahrenheit.
        Fahrenheit = (Celsius * (9/5.0)) + 32;

        // Printing the output.
        System.out.println("\nThe tempreture in Fahrenheit is " + Fahrenheit + " Degrees");

        // Closing the scanner.
        input.close();
    }
}
