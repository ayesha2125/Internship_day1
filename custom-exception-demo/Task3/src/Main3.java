public class Main3 {
    public static void main(String[] args) {

        LoginSystem ls = new LoginSystem();

        try {
            ls.login("user", "00000");   // incorrect → throws exception
        } catch (InvalidLoginException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
