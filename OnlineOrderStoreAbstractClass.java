abstract class Order
{
    abstract void processOrder(double amt);
}
class OnlineOrder extends Order
{
    void processOrder(double amt)
    {
        System.out.println("For online shopping shipping charges applicable");
        amt=amt+150;
        System.out.println("Payable amount for your order (online shopping) is :"+amt);
    }
}
class OfflineOrder extends Order
{
    void processOrder(double amt)
    {
        System.out.println("Hey!! for  offline there is no shipping charges applicable");
        System.out.println("Payable amount for your order (offline shopping) is :"+amt);
    }
}
public class OnlineOrderStoreAbstractClass
{
    public static void main(String[] args)
    {
        OnlineOrder o1= new OnlineOrder();
        o1.processOrder(999);
        OfflineOrder o2= new OfflineOrder();
        o2.processOrder(999);
    }
}
/*OUTPUT
For online shopping shipping charges applicable
Payable amount for your order (online shopping) is :1149.0
Hey!! for  ofline there is no shipping charges applicable
Payable amount for your order (offline shopping) is :999.0
 */