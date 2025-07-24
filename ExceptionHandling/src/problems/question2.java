package problems;
import java.util.Scanner;
public class question2 {
	
	
	    public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            int[] numbers = new int[5];
	            System.out.println("Enter 5 integers:");

	            for (int i = 0; i < 5; i++) {
	                numbers[i] = Integer.parseInt(sc.nextLine());
	            }

	            int sum = 0;
	            for (int num : numbers) {
	                sum += num;
	            }
	            double average = sum / 5.0;

	            System.out.println("Sum: " + sum);
	            System.out.println("Average: " + average);
	            sc.close();
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException occurred.");
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException occurred.");
	            
	        }
	        
	    }
	    
	}




