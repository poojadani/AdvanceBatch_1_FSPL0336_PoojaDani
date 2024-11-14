/*Write a program to demonstrate array declaration,initialize and creation in single line and calculate its length.*/

class ArrayDemo {
    public static void main(String args[]) {

        System.out.println("------ 1-D Array---------- ");
        int a[] = {12, 23, 34, 45, 56, 67, 78, 89, 90, 11};
        int i;
        System.out.println("Array elements from 0 to array length: ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------------- ");
        System.out.println("Array elements from array length to 0 : ");
        for (i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }


        System.out.println("------ 2-D Array---------- ");
        int[][] x = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
        System.out.println("Length of 2-D array is: ");
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println("x[0][0]: " + x[0][0]);
        System.out.println("x[0][1]: " + x[0][1]);
        System.out.println("x[1][1]: " + x[1][1]);


        System.out.println("--------3-D array-------- ");
        char[][][] c = {{{'a', 'b'}, {'c', 'd'}}, {{'e', 'f'}, {'g', 'h'}}};
        System.out.println(c.length);
        System.out.println("c[0][0][0]: " + c[0][0][0]);
        System.out.println("c[1][0][1]: " + c[1][0][1]);
    }
}

/*OUTPUT:D:\FlynautSaas_Documents\Assignments>javac ArrayDemo.java

D:\FlynautSaas_Documents\Assignments>java ArrayDemo
------ 1-D Array----------
Array elements from 0 to array length:
12
23
34
45
56
67
78
89
90
11
--------------------
Array elements from array length to 0 :
11
90
89
78
67
56
45
34
23
12
------ 2-D Array----------
Length of 2-D array is:
4
2
x[0][0]: 10
x[0][1]: 20
x[1][1]: 40
--------3-D array--------
2
c[0][0][0]: a
c[1][0][1]: f   
*/
