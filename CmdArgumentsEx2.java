public class CmdArgumentsEx2 {
    public static void main(String[] args) {
        int i, tot = 0;

        for (i = 0; i < args.length; i++) {
            tot = tot + Integer.parseInt(args[i]);
        }
        System.out.println("\nADDITION  ==> " + tot);

    }

}
