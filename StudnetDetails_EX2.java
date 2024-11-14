import java.util.Scanner;
class Student {
    int rollNumber;
    double mark1;
    double mark2;
    double mark3;
    double total;
    double percentage;
    String grade;

    Scanner sc = new Scanner(System.in);

    public void acceptInfo(){
        System.out.println("Enter The Roll Number : ");
        rollNumber=sc.nextInt();
        System.out.println("Enter the Mark1");
        mark1= sc.nextDouble();
        System.out.println("Enter the Mark2");
        mark2=sc.nextDouble();
        System.out.println("Enter the Mark2");
        mark3=sc.nextDouble();
        studentData();
    }

    public void studentData(){
        total = mark1+mark2+mark3;
        percentage= total*100/300;
        if(percentage>=90 && percentage<=100){
            grade="A+";
        } else if (percentage>=80&&percentage<90) {
            grade="A";
        } else if (percentage>=70 && percentage<80) {
            grade="B+";
        } else if (percentage >=60 && percentage<50) {
            grade="C";
        } else if (percentage>=35) {
            grade="Pass";
        } else  {
            grade="Fail";
        }
    }

    public void display(){
        System.out.println("Roll No :"+ rollNumber);
        System.out.println("Mark1 :"+ mark1);
        System.out.println("Mark2 :"+ mark2);
        System.out.println("Mark3 :"+ mark3);
        System.out.println("Total : :"+ total);
        System.out.println("Percentage :"+ percentage);
        System.out.println("Grade :"+ grade);
    }
}
public class StudnetDetails_EX2 {
    public static void main(String[] args) {
        Student S = new Student();
        S.acceptInfo();
        S.display();
    }
}
/*OUTPUT
Enter The Roll Number :
6
Enter the Mark1
78
Enter the Mark2
79
Enter the Mark2
82
Roll No :6
Mark1 :78.0
Mark2 :79.0
Mark3 :82.0
Total : :239.0
Percentage :79.66666666666667
Grade :B+
 */