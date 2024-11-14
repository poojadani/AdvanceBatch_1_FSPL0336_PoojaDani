import java.util.Scanner;

public class ShoppingCart_IFELSE {
    public static void main(String[] args) {
        System.out.println("Enter amount of item for discount checking: ");
        Scanner sc = new Scanner(System.in);
        int amount = 0, discAmount = 0;
        amount = sc.nextInt();

        if (amount >= 1000 && amount <= 5000) {
            System.out.println("You will get  10% discount");
            discAmount = amount - (amount * 10) / 100;
            System.out.println("Amount you have to pay is: " + discAmount);
        } else if (amount >= 6000 && amount <= 10000) {
            System.out.println("You will get  15% discount");
            discAmount = amount - (amount * 15) / 100;
            System.out.println("Amount you have to pay is: " + discAmount);
        } else {
            System.out.println("Sorry, There is no discount for below Rs.500 item ");
        }
    }
}
