interface Emp_1
{
      public void calculateSalary(double sal);
}
class Manager implements Emp_1
{
    public void calculateSalary(double sal)
    {
        sal=sal+30000;
        System.out.println("Managers salary is : "+sal);
    }
}
class Developer1 implements Emp_1
{
    double sal;
    public void calculateSalary(double sal)
    {
        sal=sal+20000;
        System.out.println("Developer salary is : "+sal);
    }
}

public class EMS_Inerface_EX
{
    public static void main(String[] args) {
        Manager m=new Manager();
        m.calculateSalary(25000);
        Developer1 d=new Developer1();
        d.calculateSalary(20000);
    }
}
/*OUTPUT
Managers salary is : 55000.0
Developer salary is : 40000.0
 */