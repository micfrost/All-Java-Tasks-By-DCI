package D46_CustomException.T2_Bank_Jack;

public class InvalidAccountNumberException extends Exception {

    InvalidAccountNumberException() {};
    InvalidAccountNumberException(String msg) {
        super(msg);
    }

}
