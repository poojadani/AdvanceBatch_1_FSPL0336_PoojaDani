/*Program: Transpose of a Matrix
Write a program to find the transpose of a matrix. The transpose of a matrix is formed by swapping the rows with columns.
Example Input:
[[1, 2, 3],
[4, 5, 6]]
Expected Output:
[[1, 4],
[2, 5],
[3, 6]]*/

public class TransposeMatrix
{
    static final int columns = 2;
    static final int rows = 3;

    // This function stores transpose 
    // of A[][] in B[][] 
    static void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < rows; i++)
            for (j = 0; j < columns; j++)
                B[i][j] = A[j][i];
    }

    // Driver code 
    public static void main(String[] args)
    {
        int A[][] = { {1,2,3},{4,5,6}};

        int B[][] = new int[rows][columns], i, j;

        System.out.println("Before transpose matrix(ORIGINAL) is: ");
        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++)
                System.out.print(A[i][j] + " ");
            System.out.print("\n");
        }
        //call transpose function
        transpose(A, B);

        System.out.print("Transpose matrix is: \n");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}
