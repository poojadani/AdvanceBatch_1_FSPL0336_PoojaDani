class Number
{
    private double real, image;

    public Number() {
    }

    public Number(double real, double image) {
        setRealNumber(real);
        setImaginaryiNumber(image);
    }

    public double getRealNumber()
    {
        return real;
    }

    public void setRealNumber(double realNumber) {
        this.real = realNumber;
    }

    public double getImaginaryNumber() {
        return real;
    }

    public void setImaginaryiNumber(double image) {
        this.image = image;
    }

    public void printNumber() {
        System.out.print(this.real + " + " + this.image + "i" + "\n");
    }
}

public class complexNumber {
    public static void main(String[] args) {

        Number c = new Number();
        c.setRealNumber(24.70);
        c.setImaginaryiNumber(34.0);
        c.printNumber();
        Number c1 = new Number(26.00,4.0);
        c1.printNumber();
    }
}

/*OUtPUT
24.7 + 34.0i
26.0 + 4.0i

 */
