class Array3DEX {
    public static void main(String args[]) {
        int[][][] x = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}};

        System.out.println("Type of data stored in array is :-->" + x.getClass().getName());
        System.out.println("Size of array is " + x.length);

        System.out.println("Array values are:-->");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {

                    System.out.print(x[i][j][k] + " ");

                }
                System.out.println();

            }
            System.out.println();
        }

        System.out.println("Values at [0][0][0] is: " + x[0][0][0]);
        System.out.println("Values at [0][0][1] is: " + x[0][0][2]);


        System.out.println("Values at [0][1][2] is: " + x[0][1][2]);
        System.out.println("Values at [1][2][1] is: " + x[1][2][1]);
    }
}
		
	