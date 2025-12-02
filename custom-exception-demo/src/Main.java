public class Main {
    public static void main(String[] args) {
        try {
            AgeChecker.checkAge(16);   // Demo -> will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
