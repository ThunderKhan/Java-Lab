import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    
    private static final Random diceRoller = new Random();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice (Even/Odd): ");
        String choice = input.nextLine();

        parityCheck(DiceRoll(), choice);

        input.close();
    }

    public static int DiceRoll() {
        return diceRoller.nextInt(6) + 1;
    }

    public static void parityCheck(int roll, String choice) {
        if (choice.equalsIgnoreCase("even") && roll % 2 == 0) {
            System.out.println("You won!");
        } else if (choice.equalsIgnoreCase("odd") && roll % 2 != 0) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
