public class ArithOperationCmdArg {
    public static void main(String args[]) throws Exception {
        int i, add = 0, sub = 0, mult, div, mod;

        for (i = 0; i < args.length; i++) {
            add = add + Integer.parseInt(args[i]);
            sub = sub - Integer.parseInt(args[i]);


        }
        System.out.println("\nADDITION  ==> " + add);
        System.out.println("\nSubtraction is  ==> " + sub);

    }
}