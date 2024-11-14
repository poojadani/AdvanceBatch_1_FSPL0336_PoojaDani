import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String resp = "";
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("---- Calculator ----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");

            int num1, num2;
            int result;

            System.out.print("Enter your choice");
            int ch = sc.nextInt();
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();

            switch (ch) {
                case 1: //Addition
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2: //Subtraction
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3: //Multiplication
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4: //Division
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                case 5: //Modulus
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue yes or no");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("y"));
    }
}
/*OUTPUT
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2\lib\idea_rt.jar=56071:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2\bin" -Dfile.encoding=UTF-8 -classpath D:\out\production\FlynautSaas_Documents Calculator
---- Calculator ----
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
Enter your choice1
Enter first number
11
Enter second number
11
Result: 22
Do you want to continue yes or no
y
---- Calculator ----
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
Enter your choice2
Enter first number
11
Enter second number
2
Result: 9
Do you want to continue yes or no
y
---- Calculator ----
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
Enter your choice3
Enter first number
11
Enter second number
2
Result: 22
Do you want to continue yes or no
y
---- Calculator ----
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
Enter your choice4
Enter first number
11
Enter second number
2
Result: 5
Do you want to continue yes or no
y
---- Calculator ----
1. Add
2. Subtract
3. Multiply
4. Divide
5. Modulus
Enter your choice5
Enter first number
11
Enter second number
2
Result: 1
Do you want to continue yes or no
n

Process finished with exit code 0

 */