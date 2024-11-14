public class ArithmeticOperatorEx {
    public static void main(String[] args) {
        byte b = 11;
        int i = 10;
        long l = 300;
        float f = 10.2f;
        double d = 50.5;
        char ch = 'a';
        System.out.println(i + b);  //byte in converted to int
        System.out.println(l - f); //long is converted to float
        System.out.println(f * l);  //long is converted to float
        System.out.println(l / i);   //int is converted to long
        System.out.println(b + ch);  //character a ASCII value is 97..97+11=108
        System.out.println(i % l);   //int is converted to long

    }
}
