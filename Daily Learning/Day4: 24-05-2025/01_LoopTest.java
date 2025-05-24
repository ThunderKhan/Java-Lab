public class LoopTest {
    public static void main(String[] args) {

        // Testing the newly gained knowledge of While loops
        int x = 0;
        while (x < 5) {
            x++;
            if (x == 3) continue; // Skip the rest of the loop when x is 3
            System.out.println("X: " + x);
        }
    }
}
