import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {

        // Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompting the user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Authorizing the user
        if (name.equals("Ayan Khan")) {
            System.out.println("Acceess granted, Commander Khan!");
        } else if (name.equals("ZAIK")) {
            System.out.println("Alias recognized. Welcome, Commander!");
        } else {
            System.out.println("Access denied. Unauthorized personnel.");
            return;
        }

        // Closing the Scanner
        input.close();
    }
}
