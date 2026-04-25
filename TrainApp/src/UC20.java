import java.util.Arrays;
import java.util.Scanner;

public class UC20 { 

    // Binary Search with Validation
    public static boolean safeBinarySearch(String[] bogieIds, String key) {

        //  Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Add bogies before searching.");
        }

        // Ensure sorted before search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input bogies
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = sc.nextLine();
            }
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = safeBinarySearch(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}