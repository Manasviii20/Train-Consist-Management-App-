import java.util.Arrays;
import java.util.Scanner;

public class UC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            // Match found
            if (result == 0) {
                return true;
            }

            // Key is greater → search right
            else if (result < 0) {
                low = mid + 1;
            }

            // Key is smaller → search left
            else {
                high = mid - 1;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Ensure sorting before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        sc.close();
    }
}