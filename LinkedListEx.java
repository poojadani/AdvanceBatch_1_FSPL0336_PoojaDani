import java.util.LinkedList;

public class LinkedListEx
{
    public static void main(String[] args) {
        LinkedList<String> game = new LinkedList<>();
        game.add("Batminton");
        game.add("Table Tennis");
        game.add("Cricket");
        System.out.println("Linked List is : " + game);

        // get the element from the linked list
        String value = game.get(1);
        System.out.print("Element at index 1: " + value);

        // change elements at index 3
        game.set(2, "vhollyball");
        System.out.println("Updated LinkedList: " + game);

        // remove elements from index 1
        String s1 = game.remove(1);
        System.out.println("Removed Element: " + s1);

        System.out.println("Updated LinkedList: " + game);

        // access the first element
        String str1 = game.peek();
        System.out.println("Accessed Element: " + str1);

        // access and remove the first element
        String str2 = game.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + game);

        // add element at the end
        game.offer("Carrom");
        System.out.println("LinkedList after offer(): " + game);

    }
}
/*OUTPUT
Linked List is : [Batminton, Table Tennis, Cricket]
Element at index 1: Table TennisUpdated LinkedList: [Batminton, Table Tennis, vhollyball]
Removed Element: Table Tennis
Updated LinkedList: [Batminton, vhollyball]
Accessed Element: Batminton
Removed Element: Batminton
LinkedList after poll(): [vhollyball]
LinkedList after offer(): [vhollyball, Carrom]
 */