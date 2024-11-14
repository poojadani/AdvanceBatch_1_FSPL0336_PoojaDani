import java.util.LinkedHashSet;

public class LinkedHAshSet_Ex
{
    public static void main(String[] args) {
        // Creating LinkedHashSet
        LinkedHashSet<String> language = new LinkedHashSet<>();

        // Adding elements to the linkedHashSet
        language.add("C");
        language.add("C++");
        language.add("JAVA");
        language.add("Python");
        language.add("DOT NET");
        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet : " + language);

        // Checking if an element exists
        System.out.println("Does it contain Dot net ? " + language.contains("DOT NET"));

        //remove elements
        language.remove("DOT NET");
        System.out.println("LinkedHashSet : " + language);


    }
}
/*OUTPUT
LinkedHashSet : [C, C++, JAVA, Python, DOT NET]
Does it contain Dot net ? true
LinkedHashSet : [C, C++, JAVA, Python]
 */