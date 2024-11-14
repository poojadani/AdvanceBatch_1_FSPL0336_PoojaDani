/*Write a program that calculates the grade of a student based on their marks. The grading criteria are as follows:
 90-100: A+
 80-89: A
 70-79: B+
 60-69: B
 50-59: C
 Below 50: Fail
 */
import java.util.Scanner;

public class GradeCalculation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks to check grades");
        int grades= sc.nextInt();

        //90-100
        if(grades >=90 && grades < 100)
        {
            System.out.println("A+ grade");
        }
        //80-90
        else if (grades >=80 && grades < 90)
        {
            System.out.println("A Grade");
        }
        //70-79
        else if(grades >= 70 && grades <=79)
        {
            System.out.println("B+ Grades");
        }
        //60-69
        else if(grades>=60 && grades <=69)
        {
            System.out.println("B Grade");
        }
        //50-59
        else if(grades>=50 && grades <=59)
        {
            System.out.println("C Grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
