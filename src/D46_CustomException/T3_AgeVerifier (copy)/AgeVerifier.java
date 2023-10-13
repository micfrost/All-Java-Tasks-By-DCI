package age_verification_app;

import java.util.*;

class UnderageException extends Exception{
	public UnderageException(String message) {
		super(message);
	}
}

public class AgeVerifier {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int age = scanner.nextInt();
			
			if(age < 18) {
				throw new UnderageException("To access the webseit you must be 18 years or older.");
			}
			
			System.out.println("Access to the website confirmed.");
		}catch(UnderageException e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			scanner.close();
		}

	}

}
