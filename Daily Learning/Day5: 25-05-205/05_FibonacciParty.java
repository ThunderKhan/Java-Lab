import java.util.Scanner;

public class FibonacciParty {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The Zero-th Fibonacci number is 0.");
        } else if (number == 1) {
            System.out.println("The First Fibonacci number is 1.");
        } else {
            int result = Fibonacci(number);
            System.out.println("The " + number + "-th Fibonacci number is " + result + ".");           
        }

        input.close();
    }


    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
