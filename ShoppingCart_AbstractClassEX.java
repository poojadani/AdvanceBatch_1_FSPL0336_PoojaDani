//package Day9.InterfaceAndAbstraction.Assignment;

import java.util.ArrayList;

abstract class Items_List {
    abstract String getName();

    abstract double getPrice();
}

class Electronics extends Items_List {
    private String name;
    private double price;

    //Constructor
    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {

        return price;
    }

    @Override
    public String getName() {

        return name;
    }
}

class Clothes extends Items_List {
    private String name;
    private double price;

    //constructor
    public Clothes(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {

        return price;
    }

    @Override
    public String getName() {

        return name;
    }
}

class ShoppingCart {

    ArrayList<Items_List> al = new ArrayList<>();

    public ShoppingCart() {
    }

    public void addItems(Items_List i) {
        al.add(i);
    }
    public void removeItems(Items_List i)
    {
        al.remove(i);
    }
    public ArrayList<Items_List> getItems()
    {
        // Return the list of books
        return al;
    }

    public void displayCart() {
        System.out.println("Shopping Cart contains : ");
        for (Items_List i : al)
        {
            System.out.println("Name : " + i.getName());
            System.out.println("Price :" + i.getPrice());
            System.out.println("---------------------");
        }
        System.out.println("Total Price :" + totalPrice());
    }

    public double totalPrice() {
        double total = 0;
        for (Items_List items : al) {
            total = total + items.getPrice();
        }
        return total;
    }
}

class ShoppingCart_AbstractClassEX {

    public static void main(String[] args) {

        Items_List shirt = new Clothes("Shirt", 900.00);
        Items_List saree = new Clothes("Saree", 1500.00);
        Items_List pant = new Clothes("Pant", 1200.00);

        Items_List wm = new Electronics("Washing Machine", 18000.00);
        Items_List fridge = new Electronics("Refrigerator", 40000.00);

        ShoppingCart cart = new ShoppingCart();
        cart.addItems(shirt);
        cart.addItems(saree);
        cart.addItems(pant);
        cart.addItems(wm);
        cart.addItems(fridge);

        cart.displayCart();
        System.out.println("_____________________________________");
        System.out.println("After removing some items ");
        cart.removeItems(saree);
        cart.displayCart();
    }
}
/*OUTPUT
Shopping Cart contains :
Name : Shirt
Price :900.0
---------------------
Name : Saree
Price :1500.0
---------------------
Name : Pant
Price :1200.0
---------------------
Name : Washing Machine
Price :18000.0
---------------------
Name : Refrigerator
Price :40000.0
---------------------
Total Price :61600.0
_____________________________________
After removing some items
Shopping Cart contains :
Name : Shirt
Price :900.0
---------------------
Name : Pant
Price :1200.0
---------------------
Name : Washing Machine
Price :18000.0
---------------------
Name : Refrigerator
Price :40000.0
---------------------
Total Price :60100.0
 */