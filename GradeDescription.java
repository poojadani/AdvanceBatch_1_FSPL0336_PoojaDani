/*Write a program that takes a letter grade (A, B, C, D, F) from the user and prints the corresponding grade description:
         A: "Excellent"
         B: "Good"
         C: "Average"
         D: "Below Average"
         F: "Fail" Handle invalid grade input.*/

import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letter Grade to print grade description ");
        char grades = sc.next().charAt(0);

        switch (grades) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
