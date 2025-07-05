package arrays;
	import java.util.Scanner;

	public class array13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] input = new int[4];

	        System.out.println("Enter 4 integer numbers:");

	        // Take 4 integers input
	        for (int i = 0; i < 4; i++) {
	            input[i] = scanner.nextInt();
	        }

	        // Fill 2x2 array
	        int[][] array = new int[2][2];
	        int index = 0;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                array[i][j] = input[index++];
	            }
	        }

	        // Print original array
	        System.out.println("The given array is:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Reverse the array
	        System.out.println("The reverse of the array is:");
	        for (int i = 1; i >= 0; i--) {
	            for (int j = 1; j >= 0; j--) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


