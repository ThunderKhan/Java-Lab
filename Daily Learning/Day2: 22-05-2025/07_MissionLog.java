// A Java exercise to find bugs in the code.

/*
SOURCE CODE:

public class MissionLog {
    public static void main(String[] args) {
        int day
        String status = All clear;
        boolean landed = "true";
        System.out.println("Day: " + day + ", Status: " + status + ", Landed: " + landed);
    }
}
*/

// SOLUTION:

public class MissionLog {
    public static void main(String[] args) {
        int day = 2; //Missing Semicolon and initialized the variable.
        String status = "All clear"; //The String is supposed to go in doble inverted commas.
        boolean landed = true; // A boolean type is not declared in double inverted commas.
        System.out.println("Day: " + day + "\nStatus: " + status + "\nLanded: " + landed); // Day Variable not initailized so adding value and added formatting.
    }
}
