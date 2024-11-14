class SuperClass
{
    void display()
    {
        System.out.println("Parent method ");
    }
}

class DerivedClass extends SuperClass {
    void display()
    {
        System.out.println("Child method ");
    }
    void show()
    {
        super.display();  // call the parent method
        display();        // call child method
    }
}

public class MethodOverridingEx
{
    public static void main(String[] args)
    {
        DerivedClass obj = new DerivedClass();
        obj.show();
    }
}