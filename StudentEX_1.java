class Studs {
    private int rollNo;
    private String name;
    private double totalMark;
    private String grade;

    public void assignStudent(int rollNo, String name, double totalMark) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalMark = totalMark;
        this.grade = calculateGrade(totalMark);
    }

    public String calculateGrade(double totalMark) {
        if (totalMark >= 90 && totalMark <= 100) {
            return "A";
        } else if (totalMark >= 80 && totalMark < 90) {
            return "B";
        } else if (totalMark >= 70 && totalMark < 80) {
            return "C";
        } else if (totalMark >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void printStudent() {
        System.out.println("-----------------------");
        System.out.println("Name :" + name);
        System.out.println("Roll no :" + rollNo);
        System.out.println("Total Marks :" + totalMark);
        System.out.println("Grade :" + grade);

    }
}

public class StudentEX_1 {
    public static void main(String[] args) {
        Studs s1 = new Studs();
        s1.assignStudent(06 ,"Pooja" ,90.95);

        Studs s2 = new Studs();
        s2.assignStudent(19 , "Yogesh" , 65);

        Studs s3 = new Studs();
        s3.assignStudent(29 ,"Pranjal",98.90);

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
    }
}
/*OUTPUT
-----------------------
Name :Pooja
Roll no :6
Total Marks :90.95
Grade :A
-----------------------
Name :Yogesh
Roll no :19
Total Marks :65.0
Grade :Pass
-----------------------
Name :Pranjal
Roll no :29
Total Marks :98.9
Grade :A
 */