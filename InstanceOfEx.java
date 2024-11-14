class Company {
    public void CompanyDetails() {
        System.out.println("Flynaut Saas Pvt Ltd");
    }
}

class Employee extends Company {
    public void EmpDetails() {
        System.out.println("Pooja");
    }
}

public class InstanceOfEx {
    public static void main(String[] args) {
        Company c = new Company();
        c.CompanyDetails();

        Employee e = new Employee();
        e.EmpDetails();

        System.out.println("-----Instanceof Method----");
        System.out.println(c instanceof Company);
        System.out.println(c instanceof Employee);  //c is object of parent class
        System.out.println(e instanceof Employee);
        System.out.println(e instanceof Company);   // it gets true because 'e' object of child class &
        // we use inheritance concept
        System.out.println(null instanceof Company);  // null always gets false result

    }
}
