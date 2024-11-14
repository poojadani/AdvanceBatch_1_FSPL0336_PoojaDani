import java.util.Scanner;

public class VowelsConsonants_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char to check if it is vowel or consonant");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'U':
            case 'u':
                System.out.println(c + " is vowel ");
                break;
            default:
                System.out.println(c + " is consonant");

        }
    }
}
