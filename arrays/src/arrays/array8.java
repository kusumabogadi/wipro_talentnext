package arrays;

import java.util.*;
public class array8 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size of array:");
		        int n = sc.nextInt();
		        int[] arr = new int[n];

		        System.out.println("Enter elements:");
		        for (int i = 0; i < n; i++)
		            arr[i] = sc.nextInt();

		        int sum = 0;
		        boolean skip = false;

		        for (int num : arr) {
		            if (num == 6) {
		                skip = true;
		            } else if (num == 7 && skip) {
		                skip = false;
		            } else if (!skip) {
		                sum += num;
		            }
		        }

		        System.out.println("Sum: " + sum);
		    

	}

}


