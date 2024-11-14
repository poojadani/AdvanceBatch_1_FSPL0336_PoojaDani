/*Find the First Non-Repeating Character in a String
Given a string, find the first non-repeating character and return its index. If it doesn't exist, return -1.
Example Input: "leetcode"
Expected Output: First non-repeating character is 'l' at index 0.*/

import java.util.Scanner;

public class FirstNonrepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= "geeksforgeeks";
        boolean flag = true;
        //traverse each character in the string
        for (char i : s.toCharArray()) {
            if (s.indexOf(i) == s.lastIndexOf(i)) {
                System.out.println("The first character which is not repeating is: " + i);
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("There is no non-repeating character in the input string");
        }
    }
}
