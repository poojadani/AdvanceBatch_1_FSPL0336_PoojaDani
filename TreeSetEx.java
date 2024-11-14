import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");

        // Accessing elements
        while (iterate.hasNext())
        {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using the remove() method
        boolean value1 = numbers.remove(2);
        System.out.println("Is 2 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);


        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }
}
/*OUTPUT
TreeSet: [1, 2, 6]
TreeSet using Iterator: 1, 2, 6, Is 2 removed? true
Are all elements removed? true
TreeSet: [2, 5, 6]
First Number: 2
Last Number: 6
 */