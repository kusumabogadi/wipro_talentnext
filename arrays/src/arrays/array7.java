package arrays;

import java.util.Scanner;
import java.util.Set;              // ✅ Import Set
import java.util.LinkedHashSet;   // ✅ Import LinkedHashSet

public class array7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Use LinkedHashSet to remove duplicates while maintaining order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr)
            set.add(num);

        System.out.println("Array after removing duplicates:");
        for (int num : set)
            System.out.print(num + " ");
    }
}





