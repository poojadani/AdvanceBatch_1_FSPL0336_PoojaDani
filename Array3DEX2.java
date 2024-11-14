class Array3DEX2 {
    public static void main(String args[]) {
        char[][][] c = {{{'a', 'b'}, {'c', 'd'}, {'e', 'f'}}, {{'g', 'h'}, {'i', 'j'}, {'k', 'l'}}, {{'m', 'n'}, {'o', 'p'}, {'q', 'r'}}};

        System.out.println("Type of data stored in array is :-->" + c.getClass().getName());
        System.out.println("Size of array is " + c.length);

        System.out.println("Array values are:-->");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {

                    System.out.print(c[i][j][k] + " ");

                }
                System.out.println();

            }
            System.out.println();
        }
    }
}

