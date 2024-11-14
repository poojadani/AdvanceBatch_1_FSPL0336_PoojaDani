/*
Write a program that takes a year from the user and checks if it is a leap year. A year is a leap year if:
 It is divisible by 4.
 But not divisible by 100, unless it is also divisible by 400.

 */
import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year to check if it is leap year or not");
        int year = sc.nextInt();

        if (year % 4 == 0) 
        {
            System.out.println("Leap year");
        } 
        else if (year % 100 != 0) 
        {
            if (year % 400 == 0)
            {
                System.out.println("Leap Year");
            }
            else 
            {
                System.out.println("Not Leap Year");
            }
        } 
        else 
        {
            System.out.println("Not Leap Year");
        }
    }
}
