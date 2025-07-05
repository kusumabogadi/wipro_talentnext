
	package arrays;
	import java.util.*;

	public class array11 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter size of array:");
			        int n = sc.nextInt();
			        int[] arr = new int[n];

			        System.out.println("Enter elements:");
			        for (int i = 0; i < n; i++)
			            arr[i] = sc.nextInt();

			        boolean isValid = true;

			        for (int i = 0; i < n; i++) {
			            if (arr[i] != 1 && arr[i] != 4) {
			                isValid = false;
			                break;
			            }
			        }

			        System.out.println("Only 1s and 4s? " + isValid);
			    }
			}


