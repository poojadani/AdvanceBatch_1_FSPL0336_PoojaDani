interface Payment
{
    void makePayment();
}

class CreditCardPayment implements Payment
{
    @Override
    public void makePayment() {
        System.out.println("This is makePayment method from CreditCardPayment class");
    }
}
class CashPayment implements Payment
{
    @Override
    public void makePayment() {
        System.out.println("This is makePayment method from CashPayment class");
    }
}
public class InterfaceEx_Payment
{
    public static void main(String[] args)
    {
        CreditCardPayment c=new CreditCardPayment();
        c.makePayment();

        CashPayment c1= new CashPayment();
        c1.makePayment();
    }
}
