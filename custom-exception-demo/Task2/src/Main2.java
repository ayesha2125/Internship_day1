public class Main2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500);

        try {
            acc.withdraw(800);   // will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
