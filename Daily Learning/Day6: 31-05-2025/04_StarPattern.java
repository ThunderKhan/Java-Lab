import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        printPyramid(n);

        input.close();
    }

    public static void printPyramid(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
