public class PyramidStar {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= rows; i++)
        {
            // inner loop to print space
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }

            // inner loop to print star
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
}

/*OUTPUT
       *
      * *
     * * *
    * * * *
   * * * * *
   
 */
