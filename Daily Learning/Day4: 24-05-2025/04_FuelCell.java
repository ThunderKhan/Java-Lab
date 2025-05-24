public class FuelCell {
    public static void main(String[] args) {

        int[] fuelLevels = {90, 45, 70, 20, 0, 50, 10};
        int cellId = 0;

        while (cellId < fuelLevels.length) {
            int level = fuelLevels[cellId];
            System.out.println("Fuel cell " + (cellId + 1) + ": " + level + "%");

            if (level == 0) {
                System.out.println("Emergency! Abort Sequence Initiated.");
                break;
            }

            if (level < 30) {
                System.out.println("WARNING: Fuel critically low!");
                cellId++;
                continue;
            }

            System.out.println("Cell is operational.");
            cellId++;
        }
    }
}
