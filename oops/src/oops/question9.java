package oops;
import java.util.Scanner;
public class question9 {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String input = sc.nextLine();

			String result = getFirstHalfIfEven(input);
			System.out.println("Result: " + result);

			sc.close();
		}

		public static String getFirstHalfIfEven(String str) {
			if (str.length() % 2 == 0) {
				return str.substring(0, str.length() / 2);
			} else {
				return null;
			}
		}
	}


