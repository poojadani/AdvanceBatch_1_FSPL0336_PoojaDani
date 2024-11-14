class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day , int month , int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1&& day<=31) {
            this.day = day;
        } else{
            System.out.println("Enter the valide Date .");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12) {
            this.month = month;
        } else {
            System.out.println("Enter Valide Month .");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1500&&year<=2099) {
            this.year = year;
        } else {
            System.out.println("Enter the Year in Between 1500 - 2099 .");
        }
    }

    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}




public class DateTime_EX
{
    public static void main(String[] args) {
        Date d = new Date(26,9,2024);
        d.displayDate();
    }
}
/*OUTPUT
26/9/2024

 */
