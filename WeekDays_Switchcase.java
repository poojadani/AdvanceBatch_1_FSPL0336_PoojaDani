/*Write a program that takes a number (1-7) from the user and prints the corresponding day of the week.
If the input is outside the range, print "Invalid day number.*/

import java.util.Scanner;

public class WeekDays_Switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number which day you want to print day  ");
        int x = scanner.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
