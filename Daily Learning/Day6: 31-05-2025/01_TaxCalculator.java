import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter your Income: ");
        double userIncome = input.nextDouble();

        System.out.println("\nCalculating Taxes, Please wait...\n\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculateAndDisplayTax(userIncome);

        input.close();
    }

    public static void calculateAndDisplayTax(double income) {
        if (income < 0) {
            System.out.println("Income cannot be negative.");
            return;
        }

        if (income < 10_000) {
            System.out.println("You are not eligible to pay tax.");
        } else if (income <= 20_000) {
            System.out.println("Your tax will be 10% of your income.");
            applyTax(income, 0.10);
        } else {
            System.out.println("Your tax will be 20% of your income.");
            applyTax(income, 0.20);
        }
    }

    public static void applyTax(double income, double taxRate) {
        double tax = income * taxRate;
        double finalIncome = income - tax;
        System.out.printf("Your tax is $%.2f\n", tax);
        System.out.printf("Your final income is $%.2f\n", finalIncome);
    }
}
