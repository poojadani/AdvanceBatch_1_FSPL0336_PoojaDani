public class ArrayIndex
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        try
        {
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        finally {
            System.out.println("Finally block always executed whether declare or not");
        }
    }
}
