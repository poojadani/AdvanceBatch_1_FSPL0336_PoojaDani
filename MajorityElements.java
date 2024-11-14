/*Program: Find the Majority Element in an Array
o A majority element in an array is one that appears more than n/2 times (where n is the size of the array). Write a program to find this element, if it exists.
o Example Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
o Expected Output: Majority element is 4.*/

public class MajorityElements
{

        // Function to find Majority element
        // in an array
        static void findMajority(int arr[], int n)
        {
            int maxCount = 0;
            int index = -1; // sentinels
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }

                // update maxCount if count of
                // current element is greater
                if (count > maxCount) {
                    maxCount = count;
                    index = i;
                }
            }

            // if maxCount is greater than n/2
            // return the corresponding element
            if (maxCount > n / 2)
                System.out.println(arr[index]);

            else
                System.out.println("No Majority Element");
        }

        // Driver code
        public static void main(String[] args)
        {

            int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4 };
            int n = arr.length;

            // Function calling
            findMajority(arr, n);
        }
        // This code is contributed by ajit.
}
