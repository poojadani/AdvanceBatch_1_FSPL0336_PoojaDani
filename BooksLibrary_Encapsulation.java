import java.util.ArrayList;

class Book
{
    private String title;
    private String author;
    private double price;

    // Getter method for book title
    public String getTitle()
    {
        return title;
    }
    // Setter method for book title
    public void setTitle(String title)
    {
        this.title = title;
    }
    // Getter method for book title
    public String getAuthor()
    {
        return title;
    }
    // Setter method for book title
    public void setAuthor(String author)
    {
        this.author = author;
    }

    // Getter method for book price
    public double getPrice()
    {
        return price;
    }
    // Setter method for book title
    public void setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Alert!!!Book price is negative");
        }
    }
}
class Library extends Book
{

    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book b)
    {
        books.add(b);
    }

    public void removeBook(Book b)
    {
        books.remove(b);
    }
    // Method to get the list of books
    public ArrayList<Book> getBooks()
    {
        // Return the list of books
        return books;
    }
}
public class BooksLibrary_Encapsulation
{
    public static void main(String[] args)
    {
        Library lib = new Library();

        Book book1 = new Book();
        book1.setTitle("Adventures of Tom Sawyer");
        book1.setAuthor("Mark Twain");
        book1.setPrice(250);

        Book book2 = new Book();
        book2.setTitle("Let us C");
        book2.setAuthor("Kanetkar");
        book2.setPrice(450);

        Book book3 = new Book();
        book3.setTitle("Java");
        book3.setAuthor("Y Kanetkars");
        book3.setPrice(650);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        System.out.println("---------List of Books in the library are:---------");

        for (Book book : lib.getBooks())
        {

            System.out.println("Book Title is : " + book.getTitle() + ",Author is : " + book.getAuthor() + ",  Price is: "+ book.getPrice());
        }


        lib.removeBook(book2);
        System.out.println("Remove Book Title is : " + book2.getTitle() + ",Author is : " + book2.getAuthor() + ",  Price is: "+ book2.getPrice());

        for (Book book : lib.getBooks())
        {
         System.out.println("Book Title is : " + book.getTitle() + ",Author is : " + book.getAuthor() + ",  Price is: "+ book.getPrice());

        }
    }
}
/*OUTPUT
---------List of Books in the library are:---------
Book Title is : Adventures of Tom Sawyer,Author is : Adventures of Tom Sawyer,  Price is: 250.0
Book Title is : Let us C,Author is : Let us C,  Price is: 450.0
Book Title is : Java,Author is : Java,  Price is: 650.0
Remove Book Title is : Let us C,Author is : Let us C,  Price is: 450.0
Book Title is : Adventures of Tom Sawyer,Author is : Adventures of Tom Sawyer,  Price is: 250.0
Book Title is : Java,Author is : Java,  Price is: 650.0

 */