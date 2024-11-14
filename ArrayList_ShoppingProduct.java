import java.util.ArrayList;

public class ArrayList_ShoppingProduct
{
    public static void main(String[] args) {
        ArrayList<String> product= new ArrayList<>();

        // Add elements to ArrayList
        product.add("Charger");
        product.add("Induction");
        product.add("Watch");
        product.add("Wallpaper");
        product.add("Headphone");
        System.out.println("Product in Shopping Cart  : "+product);

        System.out.println("Product at index 1 is: "+product.get(1));

        // Iterating through the list
        for(String s : product){
            System.out.println(s);
        }

        //add element at first(beginning) position
        product.add(0,"Mobile");
        System.out.println("Product in Shopping Cart  :  "+ product);

        //Remove the product at last position
         product.remove(5);
        System.out.println("Product after removing last product in Shopping Cart  :  "+ product);
    }
}

/*OUTPUT
Product in Shopping Cart  : [Charger, Induction, Watch, Wallpaper, Headphone]
Charger
Induction
Watch
Wallpaper
Headphone
Product in Shopping Cart  :  [Mobile, Charger, Induction, Watch, Wallpaper, Headphone]
Product after removing last product in Shopping Cart  :  [Mobile, Charger, Induction, Watch, Wallpaper]
 */