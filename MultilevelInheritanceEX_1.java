class Employee_1
{
    public String name;
    public double salary;
    public Employee_1(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    void getDetails() {
        System.out.println("Employee Name   :  " + name);
        System.out.println("Employee Salary :  " + salary);
    }

}
class Manager1 extends Employee_1
{
    public int teamSize;
    public Manager1(String name, double salary, int teamSize)
    {
        super(name, salary);
        this.teamSize=teamSize;
    }
    @Override
    void getDetails()
    {
        super.getDetails();
        System.out.println("Employee team size   :  " + teamSize);
    }
}
class Developer extends Manager1
{
   public  String programmingLanguage;
   Developer(String name, double salary, int teamSize, String programmingLanguage)
   {
       super(name, salary, teamSize);
       this.programmingLanguage=programmingLanguage;
   }
    void getDetails()
    {
        super.getDetails();
        System.out.println("Employee using this Programming language:  " + programmingLanguage);
    }
}
public class MultilevelInheritanceEX_1
{
    public static void main(String[] args) {

        Developer obj = new Developer("Pooja", 20000, 5, "Java");
        obj.getDetails();
    }
}
/*OUTPUT
Employee Name   :  Pooja
Employee Salary :  20000.0
Employee team size   :  5
Employee using this Programming language:  Java
 */