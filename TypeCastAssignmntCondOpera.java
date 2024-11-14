import java.net.Socket;

public class TypeCastAssignmntCondOpera {

    public static void main(String[] args) {
        System.out.println("*****Assignment Operator******");
        int a = 10;
        int b = 20;


        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);

        a += 5;
        System.out.println("\nAfter a += 5:");
        System.out.println("a = " + a);

        a -= 5;
        System.out.println("After a -= 5:");
        System.out.println("a = " + a);

        a *= 2;
        System.out.println("After a *= 2:");
        System.out.println("a = " + a);

        a /= 2;
        System.out.println("After a /= 2:");
        System.out.println("a = " + a);

        a %= 4;
        System.out.println("After a %= 4:");
        System.out.println("a = " + a);

        int a1 = 10;
        a1 >>= 2;   //a1=10/(2^2)
        System.out.println("After a1>>=2 :");
        System.out.println(a1);

        int a2 = 20;
        a2 >>= 3;   //a2=20 / (2^3)==2.5 round off 2
        System.out.println("After a2 >> 3: ");
        System.out.println(a2);

        int b1 = 15;
        b1 <<= 4;  //b1=15*2^4
        System.out.println("after b1 << 5: ");
        System.out.println(b1);

        int b2 = 10;
        b2 <<= 3;  //10*2^3
        System.out.println("After b2 <<3 :");
        System.out.println(b2);

        System.out.println("****Chained Assignment****");
        int j, k;
        j = k = 500;
        System.out.println("Value of j is: " + j);
        System.out.println("Value of k is : " + k);

        System.out.println("\n***** Type Cast Operator *****");
        int x = 'a';
        System.out.println("value of x as char a is: " + x);

        double d1 = 10;
        System.out.println("value of double d1 is: " + d1);

        System.out.println("**** Widening ****");
        int m = 15;
        float f1 = (float) m;
        System.out.println(" Typecast int to float f1 is  " + f1);

        System.out.println("**** Narrowing ****");
        int p = 130;
        byte x1 = (byte) p;
        System.out.println("Typecast int to byte x1 is: " + x1);

        double d2 = 130.5246;
        int dx = (int) d2;
        System.out.println("Typecast double to int (narrowing):dx is " + dx);

        System.out.println(" \n ***** Ternary Operator ****");
        int u = 15, v = 20, w;
        w = (u > v) ? u : v;
        System.out.println(" Value of w is : " + w);


    }
}
