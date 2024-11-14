public class OROperatorEX {
    public static void main(String[] args) {
        int m1 = 10;
        if (++m1 < 10 || m1 / 0 > 10) {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }
    }
}
