// A Simple java program to demonstrate type casting in java.

public class AlienHeight {
    public static void main(String[] args) {
        double alienHeight = 8.97; // in feet
        int roundAlienHeight = (int) alienHeight;
        float newAlienHeight = (float) alienHeight;

        System.out.println(alienHeight + " feet");
        System.out.println(roundAlienHeight + " feet");
        System.out.println(newAlienHeight + " feet");
    }
}
