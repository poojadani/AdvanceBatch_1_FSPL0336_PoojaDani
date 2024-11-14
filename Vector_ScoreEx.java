import java.util.Vector;

public class Vector_ScoreEx
{
    public static void main(String[] args) {

        Vector<Integer> score = new Vector<>();

        // Adding 6 score value
        score.add(60);
        score.add(70);
        score.add(85);
        score.add(65);
        score.add(75);
        score.add(90);

        //Accessing elements by index
        System.out.println("First score is " + score.get(0));

        // Iterate through the vector
        for( Integer s: score){
            System.out.println(s);
        }

        System.out.println("Score are: "+score);

        //size of vector
        System.out.println("Size of Score vector is: "+score.size());

        System.out.println("Is vector empty or not ? : "+score.isEmpty());

        // Update the score at the third position.
        score.set(2,82);
        System.out.println("Score are: "+score);
    }
}

/*OUTPUT
First score is 60
60
70
85
65
75
90
Score are: [60, 70, 85, 65, 75, 90]
Size of Score vector is: 6
Is vector empty or not ? : false
Score are: [60, 70, 82, 65, 75, 90]

 */
