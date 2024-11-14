import java.util.Scanner;

public class LEapYear_IfELse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the year is leap or not");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

