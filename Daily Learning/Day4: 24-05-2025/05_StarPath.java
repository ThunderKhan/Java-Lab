public class StarPath {
    public static void main(String[] args) {

        int starId = 1;
        while (starId <= 20) {
            if (starId % 2 != 0) {
                starId++;
                continue;
            }
            System.out.println("Star ID #" + starId);
            starId++;
        }
    }
}
