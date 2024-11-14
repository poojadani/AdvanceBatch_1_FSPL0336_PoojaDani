import java.util.ArrayList;
import java.util.HashSet;

public class HAshSet_UniqueEleFind
{
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};

            int[] uniqueElements = findUniqueElements(array);

            System.out.println("Unique elements in the array: ");
            for (int element : uniqueElements) {
                System.out.print(element + " ");
            }
        }

        public static int[] findUniqueElements(int[] array) {
            HashSet<Integer> uniqueSet = new HashSet<>();
            ArrayList<Integer> uniqueList = new ArrayList<>();

            for (int element : array) {
                if (!uniqueSet.contains(element)) {
                    uniqueSet.add(element);
                    uniqueList.add(element);
                }
            }

            int[] uniqueArray = new int[uniqueList.size()];
            for (int i = 0; i < uniqueList.size(); i++) {
                uniqueArray[i] = uniqueList.get(i);
            }

            return uniqueArray;
        }
    }
/*OUTPUT
Unique elements in the array:
1 2 3 4 5 6 
 */
