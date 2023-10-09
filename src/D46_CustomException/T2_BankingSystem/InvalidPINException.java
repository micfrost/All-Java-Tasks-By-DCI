package D46_CustomException.T2_BankingSystem;

public class InvalidPINException extends Exception {
    public InvalidPINException(String msg) {
        super(msg);
    }
}
