public class CmdArguments3 {
    public static void main(String[] args) {
        String[] s = {"Pooja", "Dani"};
        args = s;

        for (String s1 : args) {
            System.out.print(s1 + "\t");
        }
    }
}
