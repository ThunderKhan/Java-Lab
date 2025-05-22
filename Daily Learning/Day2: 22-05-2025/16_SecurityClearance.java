// Input a name and an ID number. Add the length of the name and the ID number’s last digit.
// Output a fake security code like:
// "SEC-AYAN7" Where 7 = name length + last digit of ID

import java.util.Scanner;

public class SecurityClearance {
    public static void main(String[] args) {

        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Ask the user for name and ID number.
        System.out.print("Enter your First name: ");
        String name = input.nextLine();

        System.out.print("Enter length of your First name: ");
        int nameLength = input.nextInt();

        System.out.print("Enter your ID number: ");
        int idNumber = input.nextInt();

        // Extracting last digit of the ID
        int lastDigit = idNumber % 10;

        // Printing security code
        System.out.print("Your Security code is successfully generated!");
        System.out.print("Your Security code is: SEC-" + name.toUpperCase() + (nameLength + lastDigit));
        
    }
}
