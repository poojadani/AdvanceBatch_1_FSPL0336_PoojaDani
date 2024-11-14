/*1. Remove Duplicates from a String.
Write a program to remove duplicate characters from a string.
 Example Input: "geeksforgeeks"
 Expected Output: "geksfor".*/

public class RemoveDuplicateString
{
    public static void main(String[] args)
    {
            String s = "geeks for geeks";
            String newstr = "";
            // using a for loop to iterate in the string
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                // checking for space in the string
                if (temp != ' ') {
                    // checking if the character is already
                    // present in the new String if not adding
                    // the character to the new string
                    if (newstr.indexOf(temp) <= -1) {
                        newstr = newstr + temp;
                    }
                }
                // if there is a space adding that to the string
                else {
                    newstr = newstr + ' ';
                }
            }
            // using trim function to remove if any leading and
            // trailing space are there
            newstr = newstr.trim();
            System.out.println(newstr);
    }
}
