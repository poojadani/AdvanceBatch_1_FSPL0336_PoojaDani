interface A_interface
{
    public void m1();

    public void m2();
}

interface B_interface extends A_interface   //One interface extends another interface
{
    public void m3();
}

abstract class abs                          //one abstract class
{
    abstract void m4();             //abstract method

    void m5()                       //concrete method
    {
        System.out.println("M5 methods");
    }
}

//subclass extends abstarct class as well as implements interface
class Sub_Class extends abs implements B_interface
{
    //implements interface methods here
    public void m1()
    {
        System.out.println("M1 method");
    }

    public void m2() {
        System.out.println("M2 method");
    }

    public void m3() {
        System.out.println("M3 method");
    }

    void m4() {
        System.out.println("M4 method");
    }

}

public class interfaceDemo
{
    public static void main(String[] args)
    {
        Sub_Class obj = new Sub_Class();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
    }
}
/*OUTPUT
M1 method
M2 method
M3 method
M4 method
M5 methods

 */