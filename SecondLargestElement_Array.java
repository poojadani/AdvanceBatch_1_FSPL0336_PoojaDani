/*Program: Find the Second Largest Element in an Array
o Write a program to find the second largest element in an array.
o Example Input: [12, 35, 1, 10, 34, 1]
o Expected Output: Second largest element is 34.*/

public class SecondLargestElement_Array
{
    public static void main(String[] args)
    {
        int a[]= {12, 35, 1, 10, 34, 1};

        int largest=a.length;
        System.out.println("Array Length is : "+largest);

        System.out.println("Array list after Sorting : ");
        for(int i =0;i<a.length;i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[largest-2]);
    }
}
/*OUTPUT
Array Length is : 6
Array list after Sorting :
34

 */