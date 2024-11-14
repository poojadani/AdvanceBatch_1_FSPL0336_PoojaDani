class BankAccounts {
    // Declare a private String variable for accountNumber, balance, and accountHolder
    private String accountNumber;
    private double balance;
    private String accountHolder;

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }
    // Setter method for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
    // Setter method for balance
    public void setBalance(double balance) {
        if (balance < 0)
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("Alert!!!Account balance is negative please maintain it at least Rs.500");
        }
    }

    // Getter method for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    // Setter method for balance
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}


public class Encapsulation_EX2 {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccounts account = new BankAccounts();

        // Set values using setter methods
        account.setAccountNumber("HDFC-123456789");
        account.setBalance(0);
        account.setAccountHolder("Pooja Dani");

        // Get values using getter methods
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();
        String accountHolder = account.getAccountHolder();

        // Print the values
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder: " + accountHolder);
    }
}
/*OUTPUT
Alert!!!Account balance is negative please maintain it at least Rs.500
Account Number: HDFC-123456789
Balance: 0.0
Account Holder: Pooja Dani

 */