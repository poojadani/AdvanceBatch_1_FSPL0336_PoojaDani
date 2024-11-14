interface interface_demo
{
    public void method1();
}
abstract class Abs_demo
{
    public void method2()
    {
        System.out.println("This is Method 2");
    }
    abstract public void method3();
}
class Main_Demo extends Abs_demo implements interface_demo
{
    @Override
    public void method1() {
        System.out.println("This is Method 1");
    }

    @Override
    public void method3() {
        System.out.println("This is Method 3");
    }
}

public class AbstactClasswithInterface_Ex
{
    public static void main(String[] args) {
        Main_Demo m= new Main_Demo();
        m.method1();
        m.method2();
        m.method3();
    }
}
/*OUTPUT
This is Method 1
This is Method 2
This is Method 3
 */