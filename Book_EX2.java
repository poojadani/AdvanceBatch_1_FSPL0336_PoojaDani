class Books_1
{
    private String bookName;
    private String author;
    private double price;

    public Books_1(){ }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Book Name :"+bookName);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
}

public class Book_EX2 {
    public static void main(String[] args) {

        Books_1 B = new Books_1();
        B.setBookName("Computer");
        B.setAuthor("Pooja Dani");
        B.setPrice(1500.00);
        B.display();

        Books_1 B1 = new Books_1();
        B1.setBookName(" C Language");
        B1.setAuthor("Kanetkar");
        B1.setPrice(450.00);
        B1.display();
    }
}
/*OUTPUT
Book Name :Computer
Author :Pooja Dani
Price :1500.0

 */
