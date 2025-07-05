package arrays;
import java.util.Scanner;
public class array1 {
	
	
	 public static void main(String[] args) {
		        int[] arr = {5, 10, 15, 20, 25};
		        int sum = 0;

		        for (int num : arr) {
		            sum += num;
		        }

		        double average = (double) sum / arr.length;

		        System.out.println("Sum = " + sum);
		        System.out.println("Average = " + average);
		    }
		}
	
	


