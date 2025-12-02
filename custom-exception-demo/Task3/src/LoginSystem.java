public class LoginSystem {

    private String correctUsername = "admin";
    private String correctPassword = "12345";

    public void login(String username, String password) throws InvalidLoginException {

        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            throw new InvalidLoginException("Invalid credentials, please try again!");
        } else {
            System.out.println("Login successful!");
        }
    }
}
