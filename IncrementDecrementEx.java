/*Program for increment and decrement operator.*/

public class IncrementDecrementEx {
    public static void main(String[] args) {
        System.out.println("------PreIncrement/Decrement------");
        int a = 10;
        int b = ++a;

        System.out.println(b);
        System.out.println(a);

        int a1 = --b;
        System.out.println(a1);
        System.out.println(b);


        System.out.println("------PostIncrement/Decrement------");
        int x = 100;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        int y1 = y--;
        System.out.println(y1);
        System.out.println(y);
    }
}
/*OUTPUT:
------PreIncrement------
11
11
10
10
------PostIncrement------
101
100
100
99
 */