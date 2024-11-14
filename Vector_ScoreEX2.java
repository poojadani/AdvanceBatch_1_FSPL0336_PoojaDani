import java.util.Vector;

public class Vector_ScoreEX2
{
    public static void main(String[] args) {
        Vector<Integer> score = new Vector<>();

        // Adding 6 score value
        score.add(80);
        score.add(70);
        score.add(85);
        score.add(75);
        score.add(90);

        // Iterate through the vector
        for( Integer s: score){
            System.out.println(s);
        }

        System.out.println("Score are: "+score);

        System.out.println("Is vector empty or not ? : "+score.isEmpty());

        // Update the score at index 2 to a new value.
        score.set(1,82);
        System.out.println("Updated Score are: "+score);

    }
}
