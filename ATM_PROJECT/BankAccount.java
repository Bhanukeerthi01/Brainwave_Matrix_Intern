public class BankAccount {
    private int accountNumber;
    private String pin;
    private double balance;

    // Constructor to initialize the account details
    public BankAccount(int accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Authenticate user by checking the entered PIN
    public boolean authenticate(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Withdraw money from the account if sufficient balance exists
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
}
