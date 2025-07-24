package problems;
import java.util.Scanner;
public class question4 {
	
	package problems;
	import java.util.Scanner;

	class InvalidCountryException extends Exception {
	    private static final long serialVersionUID = 1L;

	    public InvalidCountryException(String message) {
	        super(message);
	    }
	}

	public class question4 {
	    void registerUser(String username, String userCountry) throws InvalidCountryException {
	        if (!userCountry.equalsIgnoreCase("India")) {
	            throw new InvalidCountryException("User Outside India cannot be registered");
	        } else {
	            System.out.println("User registration done successfully");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        QuestionExceptionHandling04   ur = new QuestionExceptionHandling04();

	        System.out.println("Enter username:");
	        String username = sc.nextLine();

	        System.out.println("Enter country:");
	        String country = sc.nextLine();
	sc.close();
	        try {
	            ur.registerUser(username, country);
	        } catch (InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


