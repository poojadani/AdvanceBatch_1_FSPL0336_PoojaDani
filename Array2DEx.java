public class Array2DEx {
    public static void main(String args[]) {

        String[][] arr = {{"Pooja", "Pranjal"}, {"Sanyukta", "Krishna",}};

        //It gives the type of data stored into an array and its name.
        System.out.println("Type of data stored in array is :-->" + arr.getClass().getName());

        System.out.println("Size of array is " + arr.length);

        System.out.println("Array values are:-->");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
