package D46_CustomException.T1_UserAuthentication;

public class Authentication {

    private String usernameStored = "admin";
    private String PasswordStored = "1234";

   public void authentication(String usernameInput, String passwordInput) throws AuthenticationException {
        if (usernameInput.equals(usernameStored) && passwordInput.equals(PasswordStored)) {
            System.out.println("Username and password are correct");
        } else {
            throw new AuthenticationException("Username and/or password are not correct");
        }
    }

}
