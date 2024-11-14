import java.util.HashMap;

public class HashMapEx
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> game = new HashMap<>();

        game.put(1,"Batminton");
        game.put(2,"Table Tennis");
        game.put(3,"Cricket");
        System.out.println("HashMap contains: " + game);

        // get() method to get value
        String value = game.get(1);
        System.out.println("Value at index 1: " + value);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + game.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + game.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + game.entrySet());
    }
}
/*OUTPUT
HashMap contains: {1=Batminton, 2=Table Tennis, 3=Cricket}
Value at index 1: Batminton
Keys: [1, 2, 3]
Values: [Batminton, Table Tennis, Cricket]
Key/Value mappings: [1=Batminton, 2=Table Tennis, 3=Cricket]
 */