package java_fundamentals;
import java.util.Scanner;
public class question12 {
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a color code (R, B, G, O, Y, W): ");
	        String input = sc.nextLine().toUpperCase(); // Convert to uppercase

	       
	        char code = input.charAt(0);

	        // Check and display corresponding color
	        switch (code) {
	            case 'R':
	                System.out.println("Red");
	                break;
	            case 'B':
	                System.out.println("Blue");
	                break;
	            case 'G':
	                System.out.println("Green");
	                break;
	            case 'O':
	                System.out.println("Orange");
	                break;
	            case 'Y':
	                System.out.println("Yellow");
	                break;
	            case 'W':
	            	System.out.println("White");
	            	break;
	            default:
	                System.out.println("Invalid Code");
	        }

	        

		}

	}
	


