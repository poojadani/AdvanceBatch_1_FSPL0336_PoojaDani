import java.util.ArrayList;

public class ArrayList_Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();

        // Add elements to ArrayList
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        //add element at second position
        obj.add(1,6);
        System.out.println("Elements are: "+ obj);

        // Iterating through the list
        for(Integer i : obj){
            System.out.println(i);
        }

        //Remove the integer by its value as 2
        obj.remove(2);
        System.out.println("Elements after removing value: "+obj);

        //Remove the integer by its index 2
        obj.remove(2);
        System.out.println("Elements after removing value: "+obj);
    }
}
/*OUTPUT
Elements are: [1, 6, 2, 3, 4, 5]
1
6
2
3
4
5
Elements after removing value: [1, 6, 3, 4, 5]
Elements after removing value: [1, 6, 4, 5]

 */
