void main() {
    // Welcome message
    IO.println("=== Train Consist Management App ===");

    // Initialize passenger bogies list
    List<String> passengerBogies = new ArrayList<>();

    // Add bogies
    passengerBogies.add("Sleeper");
    passengerBogies.add("AC Chair");
    passengerBogies.add("First Class");

    // Display bogies after insertion
    IO.println("Passenger bogies added: " + passengerBogies);

    // Remove one bogie
    passengerBogies.remove("AC Chair");
    IO.println("After removing AC Chair: " + passengerBogies);

    // Check existence of Sleeper bogie
    boolean hasSleeper = passengerBogies.contains("Sleeper");
    IO.println("Does Sleeper bogie exist? " + hasSleeper);

    // Final list state
    IO.println("Final passenger bogies: " + passengerBogies);

    // Program continues...
    IO.println("System ready for further operations.");
}