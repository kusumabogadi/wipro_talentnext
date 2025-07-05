package arrays;

import java.util.Scanner;
import java.util.Arrays;  // ✅ Required for Arrays.toString()

public class array12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        // Input for array a
        System.out.println("Enter 3 elements for array a:");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        // Input for array b
        System.out.println("Enter 3 elements for array b:");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        // Get the middle elements
        int[] result = {a[1], b[1]};

        System.out.println("Middle elements: " + Arrays.toString(result));
    }
}
