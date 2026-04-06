import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate ignored automatically

        // Display final formation order
        System.out.println("Final train formation: " + trainFormation);

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}