import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = Factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
                
        input.close();
    }

    static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
    }
}
