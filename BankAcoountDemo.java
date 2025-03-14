	public class BankAccount {
    // Private attributes for sensitive data
    private String accountHolder;
    private String accountType;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountHolder, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Public getter methods to provide controlled access to private attributes
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Public method to display the account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Current Balance: $" + getBalance());
    }
}
	