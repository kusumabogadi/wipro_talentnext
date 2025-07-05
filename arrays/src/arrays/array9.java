
	package arrays;
	import java.util.*;
	public class array9 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter size of array:");
			        int n = sc.nextInt();
			        int[] arr = new int[n];

			        System.out.println("Enter elements:");
			        for (int i = 0; i < n; i++)
			            arr[i] = sc.nextInt();

			        int[] result = new int[n];
			        int index = 0;

			        for (int i = 0; i < n; i++) {
			            if (arr[i] != 10) {
			                result[index++] = arr[i];
			            }
			        }

			        System.out.println("Output after removing 10s:");
			        for (int val : result)
			            System.out.print(val + " ");
			    }
			}


