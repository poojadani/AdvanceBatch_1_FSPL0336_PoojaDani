public class StaticVar_CounterClass
{
    private static int count = 0;
    public StaticVar_CounterClass()
    {
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public static void main(String[] args)
    {
        StaticVar_CounterClass c1 = new StaticVar_CounterClass();
        StaticVar_CounterClass c2 = new StaticVar_CounterClass();
        StaticVar_CounterClass c3 = new StaticVar_CounterClass();

        System.out.println("Count: " + StaticVar_CounterClass.getCount());
    }
}
/*OUTPUT
Count: 3
 */

