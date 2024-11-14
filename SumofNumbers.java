public class SumofNumbers
{
    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to 100 is = " + sum);
    }
}
/*OUTPUT
Sum of numbers from 1 to 100 is = 5050
 */