import java.util.Scanner;

public class LoopsProject {
    public static void main(String[] args) {
        String response = "";
        do {
            System.out.println("Please select loop that you have to perform");
            System.out.println("1. For Loop to calculate factorial");
            System.out.println("2. While Loop to calculate reverse number");
            System.out.println("3. Do_while Loop for increment operation");
            System.out.println("4.If_else Loop to calculate leap year");

            int ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int n = 5, fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + n + "is: " + fact);
                    break;

                case 2:
                    int num = 123;
                    int rem = 0;
                    int rev = 0;
                    while (num != 0) {
                        rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                    }
                    System.out.println("reverse is: " + rev);
                    break;

                case 3:
                    int a = 1;
                    do {
                        System.out.println(a);
                        a++;
                    } while (a <= 10);
                    break;

                case 4:
                    System.out.println("Check the year is leap or not");
                    int year = sc.nextInt();
                    if (year % 400 == 0) {
                        System.out.println(" Yes , This is Leap year");
                    } else if (year % 100 == 0) {
                        System.out.println("Not a leap year");
                    } else if (year % 4 == 0) {
                        System.out.println(" Yes , This is Leap year");
                    } else {
                        System.out.println("Not a leap year");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue yes or no");
            response = sc.next();
        } while (response.equalsIgnoreCase("y"));
    }
}
