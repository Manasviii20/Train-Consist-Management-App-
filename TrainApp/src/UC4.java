import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index starts at 0)
        trainConsist.add(2, "Pantry Car");

        // Display train consist after insertion
        System.out.println("Train consist after insertion: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        // Display final ordered train consist
        System.out.println("Final ordered train consist: " + trainConsist);

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}