/*Write a program that takes two numbers and an operator (+, -, *, /, %) from the user
 and performs the corresponding arithmetic operation using a switch statement. Handle invalid operators.*/


import java.util.Scanner;

public class ArithmeticUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Select operator: ");
        System.out.println("1.Addition(+)");
        System.out.println("2.Subtraction(-)");
        System.out.println("3.Multiplication(+)");
        System.out.println("4.Division(/)");
        System.out.println("5.Modulus(%)");
        System.out.println("6.Exit");*/

        System.out.println("Enter value of  A");
        int a = sc.nextInt();

        System.out.println("Enter value of  B");
        int b = sc.nextInt();

        System.out.println("Enter operator which you want to perform(+,-,*,/,%)");
        char oprChoice= sc.next().charAt(0);

        switch (oprChoice)
        {
            case '+' :
                        System.out.println("Sum = "+(a+b));
                        break;

            case '-':
                        System.out.println("Difference = "+(a-b));
                        break;

            case '*':
                        System.out.println("Product = "+(a*b));
                        break;

            case '/':
                        if (b != 0) {
                            System.out.println("Division = "+(a/b));
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;

            case '%':
                        System.out.println("Modulus = "+(a%b));
                        break;
            default:
                        System.out.println("Wrong Choice!!");
                        break;
        }
    }
}
