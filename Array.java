class Array {
    int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 90, 01};
    int i;

    public void max() {
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The Maximum No. is " + max);
    }

    public void disp() {
        System.out.println("Array Elements Are");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Array Limit: " + arr.length);
    }

    public static void main(String args[]) {
        try {
            Array obj = new Array();
            obj.disp();
            obj.max();
        } catch (Exception e) {
        }
    }
}