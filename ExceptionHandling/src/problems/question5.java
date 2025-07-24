package problems;
import java.util.Scanner;
public class question5 {
	



	
	// Custom Exception Class
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class Question5 {
	    public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("Enter your name:");
	            String name = sc.nextLine();

	            System.out.println("Enter your age:");
	            int age = Integer.parseInt(sc.nextLine());

	            // Validate age
	            if (age < 18 || age > 68) {
	                throw new InvalidAgeException("Age must be between 18 and 68.");
	            }

	            // If age is valid
	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Valid age entered.");
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid age format. Please enter a valid integer for age.");
	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
