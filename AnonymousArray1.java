/*Program : Write a program for Anonymous Array.*/
class AnonymousArray1 {
    public static void main(String[] args) {

        sum(new int[]{10, 20, 30, 40}, new int[]{1, 2, 3, 4, 5});
    }

    public static void sum(int[] x, int[] y) {
        int total = 0;
        for (int x1 : x) {
            total = total + x1;
        }
        System.out.println("Sum is : " + total);

        int sum = 0;
        for (int i1 : y) {
            sum = sum + i1;
        }
        System.out.println("Sum is : " + sum);

    }
}

/*OUTPUT:
D:\FlynautSaas_Documents\Assignments>javac AnonymousArray1.java

D:\FlynautSaas_Documents\Assignments>java AnonymousArray1
Sum is : 100
Sum is : 15*/