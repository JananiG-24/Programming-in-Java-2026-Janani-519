import bank.customers.Customer;
import bank.loans.Loan;
import bank.accounts.Account;

public class Main
{
    public static void main(String[] args)
    {
        // Test Case 1
        System.out.println("TEST CASE 1");
        System.out.println("Create a customer and display customer details");

        Customer customer = new Customer(
            "C101",
            "Rahul",
            "9876543210"
        );

        customer.displayCustomerDetails();

        System.out.println();


        // Test Case 2
        System.out.println("TEST CASE 2");
        System.out.println("Create a loan and display loan details");

        Loan loan = new Loan(
            "L201",
            "Home Loan",
            500000
        );

        loan.displayLoanDetails();

        System.out.println();


        // Test Case 3
        System.out.println("TEST CASE 3");
        System.out.println("Create a bank account and deposit money");

        Account account1 = new Account(
            "A301",
            "Savings",
            0
        );

        account1.deposit(10000);

        System.out.println();


        // Test Case 4
        System.out.println("TEST CASE 4");
        System.out.println("Withdraw money within available balance");

        Account account2 = new Account(
            "A302",
            "Savings",
            20000
        );

        account2.withdraw(5000);

        System.out.println();


        // Test Case 5
        System.out.println("TEST CASE 5");
        System.out.println("Access classes from different packages using import statements");

        Customer customer2 = new Customer(
            "C102",
            "Priya",
            "9123456780"
        );

        Loan loan2 = new Loan(
            "L202",
            "Education Loan",
            300000
        );

        Account account3 = new Account(
            "A303",
            "Current",
            15000
        );

        customer2.displayCustomerDetails();
        loan2.displayLoanDetails();
        account3.displayBalance();

        System.out.println();


        // Test Case 6
        System.out.println("TEST CASE 6");
        System.out.println("Withdraw amount greater than available balance");

        Account account4 = new Account(
            "A304",
            "Savings",
            5000
        );

        account4.withdraw(8000);

        System.out.println();


        // Test Case 7
        System.out.println("TEST CASE 7");
        System.out.println("Deposit a negative amount");

        Account account5 = new Account(
            "A305",
            "Savings",
            10000
        );

        account5.deposit(-2000);

        System.out.println();


        // Test Case 8
        System.out.println("TEST CASE 8");
        System.out.println("Incorrect package name");

        System.out.println(
            "Error: bank.account package does not exist."
        );

        System.out.println();


        // Test Case 9
        System.out.println("TEST CASE 9");
        System.out.println("Create object without importing package");

        System.out.println(
            "Error: Customer cannot be resolved because its package is not imported."
        );

        System.out.println();


        // Test Case 10
        System.out.println("TEST CASE 10");
        System.out.println("Access package-private class/member from another package");

        System.out.println(
            "Error: Package-private class/member cannot be accessed from another package."
        );
    }
}
