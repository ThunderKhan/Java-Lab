import java.util.Scanner;

public class BankApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        double balance = 0;
        int userChoice;

        System.out.println("**************************");
        System.out.println(" == Welcome to the XYZ Wealthy Bank! == ");
        System.out.println("**************************");

        while (isRunning) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice (1 - 4): ");

            if (!input.hasNextInt()) {
                System.out.println("\nInvalid input. Please enter a number between 1 and 4.\n");
                input.next();
                continue;
            }

            userChoice = input.nextInt();

            switch (userChoice) {
                case 1 -> checkBalance(balance);
                case 2 -> balance = depositAmount(balance);
                case 3 -> balance = withdrawAmount(balance);
                case 4 -> isRunning = exit();
                default -> System.out.println("\nInvalid choice. Please try again.\n");
            }
        }
    }

    static void checkBalance(double balance) {
        System.out.printf("\nYour current balance is: $%.2f\n\n", balance);
    }

    static double depositAmount(double balance) {
        System.out.print("\nEnter the amount you want to deposit: ");

        if (!input.hasNextDouble()) {
            System.out.println("Invalid amount. Deposit cancelled.\n");
            input.next();
            return balance;
        }

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.\n");
            return balance;
        }

        balance += amount;
        System.out.printf("Deposit successful. Your new balance is: $%.2f\n\n", balance);
        return balance;
    }

    static double withdrawAmount(double balance) {
        System.out.print("\nEnter the amount you want to withdraw: ");

        if (!input.hasNextDouble()) {
            System.out.println("Invalid amount. Withdrawal cancelled.\n");
            input.next();
            return balance;
        }

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.\n");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal cancelled.\n");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful. Your new balance is: $%.2f\n\n", balance);
        }

        return balance;
    }

    static boolean exit() {
        System.out.println("\nThank you for using XYZ Wealthy Bank. Goodbye!");
        return false;
    }
}
