import java.util.Vector;

public class Vector_IntegerEx
{
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Adding Elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers are: "+numbers);

        // Iterate through the vector
        for( Integer number: numbers){
            System.out.println(number);
        }

        //Accessing elements by index
        System.out.println("First Number is " + numbers.get(0));
    }
}
/*OUTPUT
Numbers are: [10, 20, 30, 40, 50]
10
20
30
40
50
First Number is 10
 */