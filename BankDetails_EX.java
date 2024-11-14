class Banks
{
    private String customerName;
    private int accountNumber;
    private double balance;

    public Banks(String customerName, int accountNumber, double balance) {
        setCustomerName(customerName);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Successfully ...!");
            System.out.println(" Current Account Balance :" + balance);
        } else {
            System.out.println("Ensufficient Funds");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposite Successfully....");
            System.out.println("Account Balance : " + balance);
        } else {
            System.out.println("please deposite some amount...!");
        }
    }
}
public class BankDetails_EX {
    public static void main(String[] args) {
        Banks b = new Banks("Pooja Dani", 123456789, 33500.00);
        System.out.println("Customer Name : " + b.getCustomerName());
        System.out.println("Account Number : " + b.getAccountNumber());
        System.out.println("Account Balance : " + b.getBalance());
        System.out.println("---------------------------------------------------");
        b.withdraw(20000.00);
        System.out.println("-----------------------------------------------------");
        b.deposit(33000.00);
    }
}
/*OUTPUT
Customer Name : Pooja Dani
Account Number : 123456789
Account Balance : 33500.0
---------------------------------------------------
Withdraw Successfully ...!
 Current Account Balance :13500.0
-----------------------------------------------------
Deposite Successfully....
Account Balance : 46500.0

 */