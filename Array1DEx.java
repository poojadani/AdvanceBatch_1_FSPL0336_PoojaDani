class Array1DEx {
    int a[] = {12, 23, 34, 45, 56, 67, 78, 89, 90, 01};
    int i;

    public void display() {
        System.out.println("Array Elements Are");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array Length: " + a.length);
    }

    public void maxValue() {
        int max = a[0];
        for (i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("The Maximum No. is " + max);
    }

    public static void main(String args[]) {
        Array1DEx obj1 = new Array1DEx();
        obj1.display();
        obj1.maxValue();
    }

}

