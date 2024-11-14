/*Write a program that takes the lengths of three sides of a triangle and determines if the triangle is:
 Equilateral (all sides are equal),
 Isosceles (two sides are equal),
 Scalene (no sides are equal),
 or if the sides do not form a valid triangle.*/

import java.util.Scanner;

public class CheckTriangle_IFelse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of side A");
        int a = sc.nextInt();

        System.out.println("Enter value of side B");
        int b = sc.nextInt();

        System.out.println("Enter value of side C");
        int c = sc.nextInt();

        //Equilateral (all sides are equal),
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle (all sides are equal)");
        }
        //Isosceles (two sides are equal),
        else if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle (two sides are equal)");
        }
        // scalene triangle (No sides are equal)
        else {
            System.out.println("Scalene Triangle (No sides are equal)");
        }
    }
}
