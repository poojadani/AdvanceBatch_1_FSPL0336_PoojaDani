/*Program: Rearrange Array in Alternating Positive and Negative Numbers
Rearrange an array in such a way that positive and negative numbers alternate, while maintaining the relative order of positive and negative numbers.
Example Input: [1, 2, -3, -4, -1, 4]
Expected Output: Rearranged array: [-3, 1, -4, 2, -1, 4]. */

class RearrangeArrayPositiveNegative
{
    // Function to right rotate the subarray between out-of-place
    // element and next opposite sign element
    static void rightRotate(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }

    // Function to rearrange the array
    static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // Check if the current positive element is out of place
            if (arr[i] >= 0 && i % 2 == 1) {

                // Find the next negative element and rotate the subarray
                // between these two elements
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }

            // Check if the current negative element is out of place
            else if (arr[i] < 0 && i % 2 == 0) {

                // Find the next positive element and rotate the subarray
                // between these two elements
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] >= 0) {
                        rightRotate(arr, i, j);
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, -3, -4, -1, 4};

        rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}