public class ReversePyramid {
    public static void main(String[] args) {
        int rows = 5;

        //if user enters 5 then the loop will run 5 times
        for (int i= 0; i<= rows-1; i++)
        {

            //prints starting spaces for each row of pattern
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            //prints stars and the space between stars for each row
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            //move the cursor to new line after each row
            System.out.println();
        }
    }
}

/*OUTPUT
   * * * * *
    * * * *
     * * *
      * *
       *
 */