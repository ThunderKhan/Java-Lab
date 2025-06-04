public class TestArray {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Tesla"};
        System.out.println(cars.length);
        printCars(cars);
    }

    public static void printCars(String[] cars) {
        for (int i = 0; i <= cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
