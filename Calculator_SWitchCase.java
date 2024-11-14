import java.util.Scanner;

public class Calculator_SWitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Calculator ****");

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice");
        int ch = sc.nextInt();
        int num1, num2;

        int result = 0;


        switch (ch) {
            case 1:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();

                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();

                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();

                result = num1 * num2;
                System.out.println("Result: " + result);
                break;


            case 4:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();

                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;

        }
    }
}
