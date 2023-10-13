package D46_CustomException.T2_Bank_Jack;

public class IncorrectPinException extends Exception {

    IncorrectPinException(String msg) {
        super(msg);
    }
}
