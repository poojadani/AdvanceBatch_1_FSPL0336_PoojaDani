import java.util.Scanner;

interface Operations                  //Declare interface name as 'Operations'
{
        //multiple ways to declare interface methods
        public abstract int Addition(int num1,int num2);
        abstract public  int Subtraction(int num1,int num2);
        public  int Multiplication(int num1,int num2);
        abstract int Division(int num1,int num2);
        int Modulus(int num1,int num2);
}
class CalculateValue implements Operations     //Interface 'Operations' implements in subclass name as 'calculateValue'
{
       //implements abstract method here in subclass
         public int Addition(int num1, int num2)
        {
            return num1+num2;
        }
        public  int Subtraction(int num1,int num2)
        {
            return num1-num2;
        }
        public  int Multiplication(int num1,int num2)
        {
            return num1* num2;
        }
        public int Division(int num1,int num2)
        {
                if (num2 != 0)
                {
                    return num1 / num2;
                }
                else
                {
                   return num2 / num1;
                }
        }
        public int Modulus(int num1, int num2)
        {
            return num1 % num2;
        }
}
public class CalculatorUsingInterface
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int num1, num2, add;
            CalculateValue c= new CalculateValue();

            System.out.println("Addition is : "+  c.Addition(10,20));
            System.out.println("Subtraction is : "+  c.Subtraction(10,20));
            System.out.println("Multiplication is : "+  c.Multiplication(10,20));
            System.out.println("Division is (num<num2) : "+  c.Division(10,20));
            System.out.println("Division is (num2<num1) : "+  c.Division(20,10));
            System.out.println("Modulus is : "+  c.Modulus(11,2));
        }
}
/*OUTPUT
Addition is : 30
Subtraction is : -10
Multiplication is : 200
Division is (num<num2) : 0
Division is (num2<num1) : 2
Modulus is : 1

 */