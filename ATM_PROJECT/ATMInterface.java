import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an account with an initial balance (Account number, PIN, Balance)
        BankAccount account = new BankAccount(12345, "1234", 1000.00);

        // Display welcome message
        System.out.println("Welcome to the ATM!");

        // User authentication
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (account.authenticate(enteredPin)) {
            // If authentication is successful
            boolean sessionActive = true;

            while (sessionActive) {
                // Display ATM menu
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");
                
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Display account number and balance
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Current Balance: $" + account.getBalance());
                        break;
                    case 2:
                        // Withdraw money
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        // Deposit money
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 4:
                        // Exit the ATM system
                        System.out.println("Thank you for using the ATM!");
                        sessionActive = false;  // End the session
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            // If the PIN is incorrect
            System.out.println("Invalid PIN. Access Denied.");
        }

        scanner.close();
    }
}

