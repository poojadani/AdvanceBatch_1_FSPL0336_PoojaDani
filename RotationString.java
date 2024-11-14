/*Program: Check if Two Strings are Rotations of Each Other
Write a program to check if two strings are rotations of each other.
Example Input: "ABCD" and "CDAB"
Expected Output: Strings are rotations of each other.*/

public class RotationString
{
   static boolean areRotations(String s1, String s2) {
        /* Check if sizes of two strings are same */
        if (s1.length() != s2.length())
        {
            return false;
        }
        else
        {
            for (int i = 0; i < s1.length(); i++) {
                // checking character at ith index with
                // first character of s2
                if (s1.charAt(i) == s2.charAt(0)) {
                    // checking prefix of s2 with suffix of
                    // s1
                    if (s1.substring(i).equals(s2.substring(
                            0, s1.length() - i))) {
                        // checking prefix of s1 with suffix
                        // of s2
                        if (s1.substring(0, i).equals(
                                s2.substring(s1.length()
                                        - i)))
                            return true;
                    }
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "ABCD";
        String str2 = "CDAB";

        // Fuinction call
        if (areRotations(str1,str2))
            System.out.println(
                    "Strings are rotations of each other");
        else
            System.out.printf(
                    "Strings are not rotations of each other");
    }
}
