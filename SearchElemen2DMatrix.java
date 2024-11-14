/*Program: Search an Element in a Sorted 2D Matrix
Given a 2D matrix where each row is sorted and the first element of each row is greater than the last element of the previous row, write a program to search for an element.
Example Input:
[[1, 3, 5, 7],
[10, 11, 16, 20],
[23, 30, 34, 50]]
Target: 3
Expected Output: Element found at [0, 1]. */

import java.util.Arrays;

public class SearchElemen2DMatrix
{
    public static void main(String[] args)
    {
        int arr[][] = { {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 50}};
        int target = 3;

        int ans[] = linearSearch(arr, target);

        System.out.println("Element found at index: "+ Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
