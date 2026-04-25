import java.util.Arrays;
import java.util.Scanner;

public class UC17
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie names:");

        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        // Before Sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Built-in Sorting
        Arrays.sort(bogieNames);

        // After Sorting
        System.out.println("After Sorting: " + Arrays.toString(bogieNames));

        sc.close();
    }
}