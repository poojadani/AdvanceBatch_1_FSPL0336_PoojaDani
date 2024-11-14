public class DiamondStar
{
    public static void main(String[] args)
    {
        // Initializing the variable with the number at which
        // the number of stars will be maximum. In this case, the
        // stars will increase till 7th row, 7th row will have max
        // stars and the stars will start decreasing after 7th row.
        int rows = 5;

        int i, j;

        //print the first half of the diamond pattern
        for (i = 1; i <= rows; i++) {

            // This will print whitespaces, 5 spaces in first row
            // 4 spaces in second row and so on
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // This will print the stars after the whitespaces printed
            // by above loop. It will print 1 star in first row, 3 in second
            // 5 in third and so on
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move the cursor to new line after each row
            System.out.println();
        }

        //print the second half of the diamond pattern
        for (i = rows - 1; i > 0; i--) {

            //  print whitespaces in second half of triangle pattern
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // print stars in second half of triangle pattern
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move the cursor to new line after each row
            System.out.println();
        }
    }
}
