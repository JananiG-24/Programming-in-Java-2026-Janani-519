class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
class Account {
    String accountHolderName;
    double accountBalance;
    Account(String name, double balance) {
        accountHolderName = name;
        accountBalance = balance;
    }
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: Rs. " + accountBalance);
    }
    void withdraw(double amount)
            throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount cannot be negative."
            );
        }
        if (amount == 0) {
            System.out.println(
                "Withdrawal amount must be greater than zero."
            );
            return;
        }
        if (amount > accountBalance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }
        accountBalance = accountBalance - amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Withdrawn Amount: Rs. " + amount);
        System.out.println("Remaining Balance: Rs. " + accountBalance);
    }
}
public class Main {
    public static void main(String[] args) {
        // Test Case 1
        System.out.println("\nTEST CASE 1");
        Account a1 = new Account("Rahul", 10000);
        try {
            a1.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 2
        System.out.println("\nTEST CASE 2");
        Account a2 = new Account("Amit", 5000);
        try {
            a2.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 3
        System.out.println("\nTEST CASE 3");
        Account a3 = new Account("Rahul", 8000);
        a3.displayDetails();
        // Test Case 4
        System.out.println("\nTEST CASE 4");
        Account a4 = new Account("Priya", 15000);
        try {
            a4.withdraw(2000);
            a4.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 5
        System.out.println("\nTEST CASE 5");
        Account a5 = new Account("Kiran", 20000);
        try {
            a5.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 6
        System.out.println("\nTEST CASE 6");
        Account a6 = new Account("Ravi", 5000);
        try {
            a6.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 7
        System.out.println("\nTEST CASE 7");
        Account a7 = new Account("Neha", 10000);
        try {
            a7.withdraw(-500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 8
        System.out.println("\nTEST CASE 8");
        Account a8 = new Account("Arun", 8000);
        try {
            a8.withdraw(0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 9
        System.out.println("\nTEST CASE 9");
        try {
            String input = "Five Thousand";
            double amount = Double.parseDouble(input);
            Account a9 = new Account("Sita", 10000);
            a9.withdraw(amount);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Enter a numeric amount.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Test Case 10
        System.out.println("\nTEST CASE 10");
        Account a10 = null;
        try {
            a10.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Account object is null.");
        }
    }
}





