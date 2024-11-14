import java.io.OutputStream;
import java.util.Scanner;

public class FactorialWIthRecusiveMethod
{
     int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        FactorialWIthRecusiveMethod obj= new FactorialWIthRecusiveMethod();

        fact=obj.factorial(num);
        System.out.println("Factorial of " + num + " is : "+ fact);
    }
}

/* Output
Enter any number:4
Factorial of 4 is : 24

 */