void main() {
    // Welcome message
    IO.println("=== Train Consist Management App ===");

    // Initialize HashSet for bogie IDs
    Set<String> bogieIDs = new HashSet<>();

    // Add bogie IDs (with duplicates intentionally)
    bogieIDs.add("BG101");
    bogieIDs.add("BG102");
    bogieIDs.add("BG103");
    bogieIDs.add("BG101"); // duplicate
    bogieIDs.add("BG102"); // duplicate

    // Display final set of unique bogie IDs
    IO.println("Unique bogie IDs in train consist: " + bogieIDs);

    // Program continues...
    IO.println("System ready for further operations.");
}