 class Employees1
 {
     public void work()
     {
        System.out.println("working as an Employee");
     }
}

class Engineer11 extends Employees1
{
    public void work()
    {
        System.out.println("working as an Engineer");
    }
}
class Manager_11 extends Employees1
 {
     public void work()
     {
         System.out.println("working as an Manager");
     }
 }
 class Technicians extends Employees1
 {
     public void work()
     {
         System.out.println("working as an Technician");
     }
 }
 public class PolymorphicBEhaviorEX1
{
    public static void main(String[] args) {
        Employees1 emp = new Employees1();
        emp.work();

        Engineer11 emp1 = new Engineer11();
        emp1.work();

        Manager_11 emp2 = new Manager_11();
        emp2.work();

        Technicians emp4 = new Technicians();
        emp4.work();
    }
}
/*OUTPUT
working as an Employee
working as an Engineer
working as an Manager
working as an Technician

 */