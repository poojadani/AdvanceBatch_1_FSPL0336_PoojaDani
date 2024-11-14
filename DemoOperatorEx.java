class A {
    void method1() {
        System.out.println("hello");
    }
}

class B extends A {
    void method1() {
        System.out.println("hi");
    }
}

public class DemoOperatorEx {
    public static void main(String[] args) {

        System.out.println("____Arithmetic Operator---------");
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

        System.out.println("____Increment Decrement Operator---------");
        int c = a++;
        System.out.println(c);

        int c1 = ++a;
        System.out.println(c1);

        int d = a--;
        System.out.println(d);

        int d1 = --a;
        System.out.println(d1);
        System.out.println();


        System.out.println("------Relational Operator --------");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is : " + b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);

        System.out.println("--------Equality Operator-----");
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
        System.out.println("--------String Concatination Operator-----");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(ch == a1);


        System.out.println("---------Instanceof Operator---------");
        A obj1 = new A();
        obj1.method1();

        B obj2 = new B();
        obj2.method1();
        System.out.println(obj1 instanceof A);
        System.out.println(obj2 instanceof A);
        System.out.println(obj1 instanceof B);
        System.out.println(obj2 instanceof B);

        System.out.println("---------Bitwise Operator--------");
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(!true);  //it is used nly for boolean.
        System.out.println(~4);   //it is used only for integral values.

        System.out.println("-------Short Circuit Operator-----");
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
