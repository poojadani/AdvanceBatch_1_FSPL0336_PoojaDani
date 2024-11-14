
class calcultor_1 {
    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    //Method with 3 parameters (Overloaded Method)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        calcultor_1 calc = new calcultor_1();
        System.out.println("Sum of two numbers : " + calc.add(10, 50));
        System.out.println("Sum of three numbers : " + calc.add(10, 50, 60));
    }
}


