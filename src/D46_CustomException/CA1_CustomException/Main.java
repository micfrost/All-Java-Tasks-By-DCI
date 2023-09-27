package D46_CustomException.CA1_CustomException;

class InvalidAgeException extends Exception {
    //   Constructor
    public InvalidAgeException(String message) {
//        we are passing our message to the super constructor of super type Exception class
        super(message);
    }
}

public class Main {
    //    creating a method with a condition which throw an Exception
    static void validate(int age) throws InvalidAgeException {
        if (age < 21) {
            throw new InvalidAgeException("Message: Age is not valid.");
        } else {
            System.out.println("Message: Age is valid.");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        try {
            validate(7);
        } catch (InvalidAgeException e) {
            System.out.println("The InvalidAgeException is caught. ");
            System.out.println(e.getMessage());
        }
    }
}
