import java.util.Scanner;

public class PasswordLock {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password = "";

        while (!password.equals("Solaris90")) {
            System.out.print("Enter the password: ");
            password = input.nextLine();
        }
        System.out.println("Accress granted.");

        input.close();
    }
}
