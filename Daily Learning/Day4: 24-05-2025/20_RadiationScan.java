public class RadiationScan {
    public static void main(String[] args) {
        for (int hour = 1; hour <= 24; hour++) {
            if (hour % 4 == 0) {
                System.out.println("Radiation spike detected at hour: " + hour); 
            }
        }
    }
}
