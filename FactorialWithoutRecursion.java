import java.util.Scanner;

class FactorialWithoutRecursion
{

    int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        FactorialWithoutRecursion obj = new FactorialWithoutRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : "+ obj.factorial(num));
    }
}

/*OUTPUT
Enter any number:5
Factorial of 5 is : 120
 */


