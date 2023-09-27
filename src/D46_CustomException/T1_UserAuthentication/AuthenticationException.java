package D46_CustomException.T1_UserAuthentication;

public class AuthenticationException extends Exception {
    public AuthenticationException(String msg) {
        super(msg);
    }
}
