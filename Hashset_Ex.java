import java.util.HashSet;

public class Hashset_Ex
{
    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding Elements to the hashset
        fruits.add("Dragon Fruit");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Mango");

        //Displaying the Hashset
        System.out.println("HasSet : " + fruits);

        // Checking the element exist or not
        System.out.println("Does hashset contains Dragon fruit ? "+ fruits.contains("Dragon Fruit"));

        System.out.println("Is HashSet Empty ? " + fruits.isEmpty());

        // Removing an element
        fruits.remove("Mango");
        System.out.println("After removal : " + fruits);

        // To check the size of the set
        System.out.println("Size of HashSet :" + fruits.size());

        // To clear all the elements from the set
        fruits.clear();
        System.out.println("Is HashSet Empty ? " + fruits.isEmpty());

    }
}
/*OUTPUT
HasSet : [Apple, Grapes, Dragon Fruit, Mango, Banana]
Does hashset contains Dragon fruit ? true
Is HashSet Empty ? false
After removal : [Apple, Grapes, Dragon Fruit, Banana]
Size of HashSet :4
Is HashSet Empty ? true

 */