import java.util.TreeSet;

public class TreeSet_EX
{
    public static void main(String[] args) {
        //Creating a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        //Adding the elements to the TreeSet
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        // Displaying the TreeSet
        System.out.println("TreeSet : " + numbers);

        //Accessing the first and last method
        System.out.println("First Element : " + numbers.first());
        System.out.println("Last Element : " + numbers.last());

        //Removing an element
        numbers.remove(10);
        System.out.println("After Removal TreeSet : " + numbers);

        //Checking if an element exists
        System.out.println("Does it contain 100 ? "+ numbers.contains(50));

        //Polling elements
        System.out.println("Poll first element : "+ numbers.pollFirst());
        System.out.println("After polling TreeSet : " + numbers);

    }
}
/*OUTPUT
TreeSet : [10, 20, 30, 40]
First Element : 10
Last Element : 40
After Removal TreeSet : [20, 30, 40]
Does it contain 100 ? false
Poll first element : 20
After polling TreeSet : [30, 40]
* */