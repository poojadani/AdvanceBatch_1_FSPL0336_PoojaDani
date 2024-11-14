class BankAccount {
    public double principal;
    public double rate;
    public int time;

    public BankAccount(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest() {
        return principal * rate * time / 100;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    public double calculateInterest() {
        // For fixed deposits, interest is calculated simply
        return super.calculateInterest();
    }
}

class CurrentAccount extends BankAccount {
    private int monthlyInstallments;

    public CurrentAccount(double principal, double rate, int time, int monthlyInstallments) {
        super(principal, rate, time);
        this.monthlyInstallments = monthlyInstallments;
    }

    public double calculateInterest() {
        // For CurrentAccount deposits, interest is calculated differently
        double monthlyRate = rate / 12 / 100;
        double totalAmount = principal * monthlyInstallments +
                (monthlyInstallments * (monthlyInstallments + 1) / 2) * monthlyRate * time;
        double totalInterest = totalAmount - principal;
        return totalInterest;
    }
}

public class Method_Overriding_Ex {
    public static void main(String[] args) {
        SavingsAccount fd = new SavingsAccount(10000, 8, 3);
        CurrentAccount rd = new CurrentAccount(5000, 7, 3, 12);

        System.out.println("Interest from Fixed Deposit: " + fd.calculateInterest());
        System.out.println("Interest from CurrentAccount Deposit: " + rd.calculateInterest());
    }
}
/*OUTPUT
Interest from Fixed Deposit: 2400.0
Interest from CurrentAccount Deposit: 55001.365

 */
