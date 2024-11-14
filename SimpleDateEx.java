class Dates {
    public int day;
    public int month;
    public int year;

    public void  setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void displayDate()
    {
        System.out.println("--------------");
        System.out.println("Date is : "+day);
        System.out.println("Month is : "+month);
        System.out.println("Year is : "+year);
        System.out.println("Date is : "+day+"/"+month+"/"+year);
    }
}
public class SimpleDateEx {
    public static void main(String[] args) {
        Dates d= new Dates();
        d.setDate(26,9,2024);
        d.displayDate();
    }
}

/*OUTPUT
--------------
Date is : 26
Month is : 9
Year is : 2024
Date is : 26/9/2024
 */