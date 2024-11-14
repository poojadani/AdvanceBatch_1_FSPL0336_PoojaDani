import java.util.Scanner;

class Sample {
    void method1() {
        System.out.println("hello");
    }
}

class Sample1 extends Sample {
    void method1() {
        System.out.println("hi");
    }
}

public class MiniProject {
    public static void main(String[] args) {
        String response1 = "";
        do {
            System.out.println("Please select operation that you have to perform");
            System.out.println("1. Array");
            System.out.println("2. Operators");
            System.out.println("3. Loops");

            int ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the choice");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("1-D Array");
                    int[] array1 = {10, 20, 30, 40, 50};
                    for (int i = 0; i < array1.length; i++) {
                        System.out.print("value in 1 D array: " + array1[i] + " ");
                    }

                    System.out.println("\n\n 2-D Array");
                    String[][] arr = {{"Pooja", "Pranjal"}, {"Sanyukta", "Krishna",}};
                    System.out.println("Type of data stored in array is :-->" + arr.getClass().getName());

                    System.out.println("Size of array is " + arr.length);

                    System.out.println("Array values are:-->");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }


                    System.out.println("----3-D Array----");
                    int[][][] array2 = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}};

                    System.out.println("Type of data stored in array is :-->" + array2.getClass().getName());
                    System.out.println("Size of array is " + array2.length);

                    System.out.println("Array values are:-->");
                    for (int i = 0; i < array2.length; i++) {
                        for (int j = 0; j < array2.length; j++) {
                            for (int k = 0; k < array2[i][j].length; k++) {

                                System.out.print(array2[i][j][k] + " ");

                            }
                            System.out.println();

                        }
                        System.out.println();
                    }
                    System.out.println("Values at [0][0][0] is: " + array2[0][0][0]);
                    System.out.println("Values at [0][0][1] is: " + array2[0][0][2]);
                    System.out.println("Values at [0][1][2] is: " + array2[0][1][2]);
                    System.out.println("Values at [1][2][1] is: " + array2[1][2][1]);
                    break;

                case 2:
                    String response = "";
                    do {
                        System.out.println("Please select operation");
                        System.out.println("1. Arithmetic Operator");
                        System.out.println("2. Increment /Decrement Operator");
                        System.out.println("3. Relational Operator");
                        System.out.println("4. Equality Operator ");
                        System.out.println("5.String Concatination Operator");
                        System.out.println("6. Instanceof Operator & New Operator");
                        System.out.println("7. Bitwise Operator");
                        System.out.println("8. Ternary Operator ");
                        System.out.println("9. Type Cast Operator");
                        System.out.println("10. Assignment Operator");
                        System.out.println("11. [] Operator (Array access)");
                        System.out.println("12. Operator Precedence");
                        System.out.println("13. Short Circuit Operator");

                        int oprch = 0;

                        System.out.println("Please enter the choice");
                        oprch = sc.nextInt();

                        int a = 10;
                        int b = 20;
                        int c = 10;
                        int x = 10;
                        int y = 20;
                        String s = "pooja";
                        String s1 = "Pooja";
                        String s2 = "pooja";
                        String s3 = s1;
                        char c3 = 'a';
                        int a1 = 97;

                        switch (oprch) {
                            case 1:
                                System.out.println("____1. Arithmetic Operator---------");
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
                                break;

                            case 2:
                                System.out.println("____2.Increment Decrement Operator---------");
                                int c1 = a++;
                                System.out.println(c1);

                                int c2 = ++a;
                                System.out.println(c1);

                                int d = a--;
                                System.out.println(d);

                                int d1 = --a;
                                System.out.println(d1);
                                System.out.println();
                                break;

                            case 3:
                                System.out.println("------3.Relational Operator --------");
                                System.out.println("Value of a is: " + a);
                                System.out.println("Value of b is : " + b);
                                System.out.println(a > b);
                                System.out.println(a < b);
                                System.out.println(a <= b);
                                System.out.println(a >= b);
                                System.out.println(a != b);
                                break;

                            case 4:
                                System.out.println("--------4.Equality Operator-----");
                                System.out.println(x == y);
                                System.out.println(s == s1);
                                System.out.println(s == s2);
                                break;

                            case 5:
                                System.out.println("-------- 5.String Concatination Operator-----");
                                System.out.println(s.equals(s1));
                                System.out.println(s.equals(s2));
                                System.out.println(s1.equals(s3));
                                System.out.println(c3 == a1);
                                break;

                            case 6:
                                System.out.println("---------6. Instanceof Operator & New Operator---------");
                                Sample obj1 = new Sample();
                                obj1.method1();

                                Sample1 obj2 = new Sample1();
                                obj2.method1();
                                System.out.println(obj1 instanceof Sample);
                                System.out.println(obj2 instanceof Sample);
                                System.out.println(obj1 instanceof Sample1);
                                System.out.println(obj2 instanceof Sample1);
                                break;

                            case 7:
                                System.out.println("---------7 .Bitwise Operator--------");
                                System.out.println(4 & 5);
                                System.out.println(4 | 5);
                                System.out.println(4 ^ 5);
                                System.out.println(!true);  //it is used nly for boolean.
                                System.out.println(~4);   //it is used only for integral values.
                                break;

                            case 8:
                                System.out.println(" \n ***** 8 .Ternary Operator ****");
                                int u = 15, v = 20, w;
                                w = (u > v) ? u : v;
                                System.out.println(" Value of w is : " + w);
                                break;

                            case 9:
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
                                break;

                            case 10:
                                System.out.println("***** 10. Assignment Operator ******");
                                int aa = 10;
                                int bb = 20;


                                System.out.println("value of aa = " + aa);
                                System.out.println("value of bb = " + bb);

                                aa += 5;
                                System.out.println("\nAfter aa += 5:");
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
                                break;

                            case 11:
                                System.out.println("-------11. [] Operator (Array access)-----");
                                int[] numbers = {1, 2, 3, 4, 5};
                                System.out.println("Second number in array is : " + numbers[1]);
                                break;

                            case 12:
                                System.out.println("-------12. Operator Precedence-----");
                                int prece = a + b * c;       //a=10,b=20,c=10
                                System.out.println("Result according to precedence is : " + prece);
                                break;

                            case 13:
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
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                        System.out.println("Do you want to continue operators choice yes or no");
                        response = sc.next();
                    } while (response.equalsIgnoreCase("y"));
                    break;
                case 3:
                    //Do_while Loop
                    int i = 1;
                    System.out.println("value of i is:" + i);
                    do {
                        System.out.println("NEW VALUE OF i is:" + i);
                        i++;
                    } while (i <= 10);


                    //For_LOOP
                    int i1, fact = 1;
                    int num1 = 5;
                    for (i1 = 1; i1 <= num1; i1++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + num1 + " is: " + fact);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue yes or no");
            response1 = sc.next();
        } while (response1.equalsIgnoreCase("y"));
    }
}
