class A1 {
    void method1() {
        System.out.println("hello");
    }
}

class B1 extends A1 {
    void method1() {
        System.out.println("hi");
    }
}

public class AllOperatorsCombine {
    public static void main(String[] args) {

        System.out.println("____1. Arithmetic Operator---------");
        int a = 10;
        int b = 20;
        int add = a + b;
        System.out.println("Addition is:" + add);
        int sub = a - b;
        System.out.println("Subtraction  is:" + sub);
        int mult = a * b;
        System.out.println("Multiplication is:" + mult);
        int div = a / b;
        System.out.println("Division  is:" + div);
        int mod = a % b;
        System.out.println("Modulus is:" + mod);


        System.out.println("____2.Increment Decrement Operator---------");
        int c = a++;
        System.out.println(c);

        int c1 = ++a;
        System.out.println(c1);

        int d = a--;
        System.out.println(d);

        int d1 = --a;
        System.out.println(d1);
        System.out.println();

        System.out.println("------3.Relational Operator --------");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is : " + b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);


        System.out.println("--------4.Equality Operator-----");
        int x = 10;
        int y = 20;
        String s = "pooja";
        String s1 = "Pooja";
        String s2 = "pooja";
        String s3 = s1;
        char ch = 'a';
        int a1 = 97;

        System.out.println(x == y);
        System.out.println(s == s1);
        System.out.println(s == s2);

        System.out.println("--------5. String Concatination Operator-----");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(ch == a1);


        System.out.println("---------6. Instanceof Operator & New Operator---------");
        A1 obj1 = new A1();
        obj1.method1();

        B1 obj2 = new B1();
        obj2.method1();
        System.out.println(obj1 instanceof A1);
        System.out.println(obj2 instanceof A1);
        System.out.println(obj1 instanceof B1);
        System.out.println(obj2 instanceof B1);


        System.out.println("---------7 .Bitwise Operator--------");
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(!true);  //it is used nly for boolean.
        System.out.println(~4);   //it is used only for integral values.


        System.out.println(" \n ***** 8 .Ternary Operator ****");
        int u = 15, v = 20, w;
        w = (u > v) ? u : v;
        System.out.println(" Value of w is : " + w);

        System.out.println("\n***** 9. Type Cast Operator *****");
        int x11 = 'a';
        System.out.println("value of x as char a is: " + x11);

        double dd1 = 10;
        System.out.println("value of double d1 is: " + dd1);

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


        System.out.println("***** 10. Assignment Operator******");
        int aa = 10;
        int bb = 20;


        System.out.println("value of a = " + aa);
        System.out.println("value of b = " + bb);

        aa += 5;
        System.out.println("\nAfter a += 5:");
        System.out.println("aa = " + aa);

        aa -= 5;
        System.out.println("After aa -= 5:");
        System.out.println("aa = " + aa);

        aa *= 2;
        System.out.println("After aa *= 2:");
        System.out.println("aa = " + aa);

        aa /= 2;
        System.out.println("After aa /= 2:");
        System.out.println("aa = " + aa);

        aa %= 4;
        System.out.println("After aa %= 4:");
        System.out.println("aa = " + aa);

        int aa1 = 10;
        aa1 >>= 2;   //a1=10/(2^2)
        System.out.println("After a1>>=2 :");
        System.out.println(aa1);

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


        System.out.println("-------11. [] Operator (Array access)-----");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Second number in array is : " + numbers[1]);


        System.out.println("-------12. Operator Precedence-----");
        int prece = a + b * c;       //a=10,b=20,c=10
        System.out.println("Result according to precedence is : " + prece);


        System.out.println("-------13. Short Circuit Operator-----");
        System.out.println("--------Ex1--------");
        if (x++ < 10 && ++y > 15) {
            x++;
        } else {
            y++;
        }
        System.out.println("x is :" + x);
        System.out.println("y is : " + y);
        System.out.println("---------EX2--------");
        int m1 = 10;
        System.out.println("------&& Operator-----");
        if (++m1 < 10 && m1 / 0 > 10)  //m1 will become 11, and 11<10 is false so transfer control to else
        {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }

//        if(++m1>10 &&  m1/0>10)   //11>10 is true then check for 2nd condition so it gives divide by zero error.
//        {
//            System.out.println("hi");
//        }
//        else {
//            System.out.println("hello");
//        }

        System.out.println("----|| operator----");
        System.out.println("current m1 value is :" + m1);
        if (++m1 > 10 || m1 / 0 > 10)  // 1st condition false then 2nd condition won't evaluate.
        {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }
        if (++m1 < 10 || m1 / 0 > 10)  // m1=12, 1st condition true then 2nd condition will evaluate.
        // it goves divide by zero error.
        {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }


    }
}
