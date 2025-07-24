package problems;
import java.util.Scanner;

public class question3 {
	
	import java.util.Scanner;

	// Custom checked exception for negative input
	class NegativeValueException extends Exception {
	    public NegativeValueException(String message) {
	        super(message);
	    }
	}

	// Custom checked exception for input outside the allowed range
	class OutOfRangeException extends Exception {
	    public OutOfRangeException(String message) {
	        super(message);
	    }
	}

	public class Question3 {
	    public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.print("Enter student name: ");
	            String name = sc.nextLine();

	            int[] marks = new int[3];
	            int sum = 0;

	            System.out.println("Enter marks in 3 subjects (between 8 and 100):");
	            for (int i = 0; i < 3; i++) {
	                System.out.print("Mark " + (i + 1) + ": ");
	                String input = sc.nextLine();
	                int mark;

	                try {
	                    mark = Integer.parseInt(input);
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid number format: '" + input + "'");
	                    return;
	                }

	                if (mark < 0) {
	                    throw new NegativeValueException("Negative values not allowed: " + mark);
	                }
	                if (mark < 8 || mark > 100) {
	                    throw new OutOfRangeException("Value out of allowed range (8–100): " + mark);
	                }

	                marks[i] = mark;
	                sum += mark;
	            }

	            double average = sum / 3.0;
	            System.out.printf("Average marks of %s: %.2f%n", name, average);

	        } catch (NegativeValueException | OutOfRangeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



