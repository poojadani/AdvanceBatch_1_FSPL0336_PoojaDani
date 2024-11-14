class calculator_EX1
{
    int add(int a, int b) {
        return a + b;
    }

    //Method with 3 parameters (Overloaded Method)
    float add(float a, float b)
    {
        return a + b;
    }
    double add(double a, double b)
    {
        return a + b;
    }
}
public class MethodOverloading_EX11
{
    public static void main(String[] args) {
        calculator_EX1 c = new calculator_EX1();
        System.out.println("Sum of two numbers : " + c.add(10, 50));
        System.out.println("Sum of two numbers : " + c.add(10.00f ,50.00f));
        System.out.println("Sum of two numbers : " + c.add(10.000, 50.0000));
    }
}
