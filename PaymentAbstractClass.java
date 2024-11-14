abstract class Payments
{
    abstract void  makePayments_m1(double amount);
}

class CreditCardPayment_1 extends Payments
{
    double amount;
    void  makePayments_m1(double amount)
    {
        System.out.println("This is make payments method");
        amount=amount+1500;
        System.out.println("Creditcard payable amount is : "+amount);
    }
}
class UPIPayment extends Payments
{
    void  makePayments_m1(double amount)
    {
        System.out.println("This is make payments method");
        amount=amount+100;
        System.out.println("UPIPayments payable amount is : "+amount);
    }
}
public class PaymentAbstractClass
{
    public static void main(String[] args) {
        CreditCardPayment_1 c=new CreditCardPayment_1();
        c.makePayments_m1(15000);
        UPIPayment u=new UPIPayment();
        u.makePayments_m1(20000);
    }
}
/*OUTPUT
This is make payments method
Creditcard payable amount is : 16500.0
This is make payments method
UPIPayments payable amount is : 20100.0
 */