//program of Sort of an Array of Integers.

public class ArraySort_BubbleSort
{
    public static void main(String[] args)
    {
        int a[]={50,40,30,10,20,60};
        System.out.println("Array list Before sort: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
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
            System.out.println(a[i]);
        }
    }
}





/*OUTPUT
Array list Before sort:
50
40
30
10
20
60
Array list after Sorting :
10
20
30
40
50
60

Process finished with exit code 0
*/