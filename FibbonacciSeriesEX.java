//Program to Print Fibbonacci series.

import java.util.Scanner;

public class FibbonacciSeriesEX
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number of series: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Ending number of series: ");
        int num2 = sc.nextInt();
        System.out.println("FIBBONACCI SERIES:==>");

        int a = 0;
        int b = 1;
        int c = 0;

        while (c <= num2)
        {
            if (c >= num1)
                System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
/*OUTPUT
Enter starting number of series:
0
Enter Ending number of series:
13
FIBBONACCI SERIES:==>
0
1
1
2
3
5
8
13      */
