class Emp
{
    private String EmpId;
    private String EmpName;
    private double salary;
    public Emp(){ }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String Empname) {
        this.EmpName = Empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee ID :"+EmpId);
        System.out.println("Employee Name :"+EmpName);
        System.out.println("Employee Salary :"+salary);
    }
}
public class Emp_CalculateAnnualSal
{
    public static void main(String[] args)
    {
        Emp e = new Emp();
        e.setEmpId("FSPL00006");
        e.setEmpName("Pooja Dani");
        e.setSalary(30000.00);
        e.display();

        Emp e1 = new Emp();
        e1.setEmpId("FSPL00005");
        e1.setEmpName("Pranjal Dani");
        e1.setSalary(30000.00);
        e1.display();

    }
}
/*OUTPUT
4Employee ID :FSPL00006
Employee Name :Pooja Dani
Employee Salary :30000.0
Employee ID :FSPL00005
Employee Name :Pranjal Dani
Employee Salary :30000.0

 */