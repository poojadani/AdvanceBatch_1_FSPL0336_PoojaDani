public class Floyds_Triangle {
    public static void main(String[] args) {
        int n = 4;
        int i, j, k = 1;
        // Outer loop for rows
        for (i = 1; i <= n; i++)
        {
            // Inner loop for columns
            for (j = 1; j <= i; j++)
            {
                // Printing value to be displayed
                System.out.print(k + "  ");

                // Incremeting value displayed
                k++;
            }

            // Print elements of next row
            System.out.println();

        }
    }
}
