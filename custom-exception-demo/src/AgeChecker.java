public class AgeChecker {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18+ to register");
        } else {
            System.out.println("Age accepted. You can register.");
        }
    }
}
