//program to Find the Sum of Digits of a Number.
import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();

        int rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digit of number is: "+sum);
    }
}
/*OUTPUT
Enter Number:
897
Sum of digit of number is: 24

Process finished with exit code 0

 */