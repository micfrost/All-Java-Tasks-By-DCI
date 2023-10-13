package D46_CustomException.T2_Bank_Jack;

public class InsuficientFundsException extends Exception {

    InsuficientFundsException() {};
    InsuficientFundsException(String msg) {
        super(msg);
    }

}
