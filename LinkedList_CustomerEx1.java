import java.util.LinkedList;

public class LinkedList_CustomerEx1
{
    public static void main(String[] args) {
        LinkedList<String> cust = new LinkedList<>();

        //Adding elements as customer
        cust.add("Pooja");
        cust.add("Pranjal");
        cust.add("Sanyukta");
        cust.add("Sunita");
        cust.add("Mrudula");

        System.out.println("Customer list :"+cust);

        //Accessing the elements
        System.out.println("First customer name is " + cust.getFirst() );

        //add customer at first position
        cust.addFirst("Ishika");
        System.out.println("Customer list :"+cust);

        //remove customer at first position
        cust.removeFirst();
        System.out.println("After removing first Customer ,List contains :"+cust);

        //add customer at last position
        cust.addLast("Yashika");
        System.out.println("Customer list :"+cust);
    }
}

/*OUTPUT
Customer list :[Pooja, Pranjal, Sanyukta, Sunita, Mrudula]
First customer name is Pooja
Customer list :[Ishika, Pooja, Pranjal, Sanyukta, Sunita, Mrudula]
After removing first Customer ,List contains :[Pooja, Pranjal, Sanyukta, Sunita, Mrudula]
Customer list :[Pooja, Pranjal, Sanyukta, Sunita, Mrudula, Yashika]
 */