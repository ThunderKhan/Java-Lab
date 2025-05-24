import java.util.Scanner;

public class BioScan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userBioSignature;

        do {
            System.out.print("Please enter your Bio-Key: ");
            userBioSignature = input.nextLine();
        } while (!userBioSignature.equals("unlock"));
        
        System.out.println("Access Granted!");
        input.close();
    }
}
