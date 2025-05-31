import java.util.Scanner;

public class LoginTracker {

    public static final String PASSWORD = "Solaris123";
    public static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loginSuccess = loginPasswordCheck(input, MAX_ATTEMPTS);

        if (loginSuccess) {
            System.out.println("Welcome Commander!");
        } else {
            System.out.println("All Systems locked for security!");
        }

        input.close();
    }

    public static boolean loginPasswordCheck(Scanner input, int MAX_ATTEMPTS) {
        int attemptsLeft = MAX_ATTEMPTS;

        while (attemptsLeft > 0) {
            System.out.print("\n\nEnter the password: ");
            String userPassword = input.nextLine();

            if (userPassword.equals(PASSWORD)) {
                return true;
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Wrong Password! Attempts Left: " + attemptsLeft);
                }
            }
        }
        return false;
    }
}
