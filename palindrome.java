public class palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, rem;

        // store the number to originalNum
        int originalNum = num;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        // check if rev and originalNum are equal
        if (originalNum == rev) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }

    }
}
/*OUTPUT
121 is Palindrome.

 */