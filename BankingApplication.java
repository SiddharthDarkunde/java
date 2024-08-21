import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

    Scanner sc = new Scanner(System.in);

    // Method to open a new account
    public void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.next();
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.next();
        System.out.print("Enter Account Type: ");
        accountType = sc.next();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    // Method to display account details
    public void showAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to search an account by account number
    public boolean search(String accNo) {
        if (accountNumber.equals(accNo)) {
            showAccount();
            return true;
        }
        return false;
    }
}



public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many customers do you want to input? ");
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
            accounts[i].openAccount();
        }

        int choice;
        do {
            System.out.println("\n***Banking System Application***");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (BankAccount account : accounts) {
                        account.showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account number to search: ");
                    String accNo = sc.next();
                    boolean found = false;
                    for (BankAccount account : accounts) {
                        found = account.search(accNo);
                        if (found) break;
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number to deposit: ");
                    accNo = sc.next();
                    found = false;
                    for (BankAccount account : accounts) {
                        found = account.search(accNo);
                        if (found) {
                            account.deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw: ");
                    accNo = sc.next();
                    found = false;
                    for (BankAccount account : accounts) {
                        found = account.search(accNo);
                        if (found) {
                            account.withdraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using our banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }
}
