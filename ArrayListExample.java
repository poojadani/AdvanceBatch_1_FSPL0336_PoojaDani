import java.util.ArrayList;

public class ArrayListExample
{
        public static void main(String[] args) {
            ArrayList<String> game = new ArrayList<>();

            // Add elements to ArrayList
            game.add("Batminton");
            game.add("Table Tennis");
            game.add("Cricket");
            System.out.println("ArrayList: " + game);

            game.remove(1);
            System.out.println("ArrayList: " + game);
        }
}

/*OUTPUT
ArrayList: [Batminton, Table Tennis, Cricket]
ArrayList: [Batminton, Cricket]
 */