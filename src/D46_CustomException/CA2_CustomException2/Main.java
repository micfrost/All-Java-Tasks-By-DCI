package D46_CustomException.CA2_CustomException2;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("oh no: ");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Catch block of InvalidAgeException.");
        }
        System.out.println("normal flow . . . ");
    }
}
