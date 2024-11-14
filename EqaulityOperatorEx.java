public class EqaulityOperatorEx {
    public static void main(String[] args) {
        String s1 = "pooja";
        String s2 = "abc";
        System.out.println(s1 == s2); // s1 and s2 are not same

        String s3 = "pooja";
        System.out.println(s1 == s3);  //s1 and s3 are same.

        int a = 97;
        char c = 'a';
        System.out.println(a == c);  //character 'a' has ASCII value is 97 and int a value is also 97

        System.out.println("--------Equals method--------");
        String s = new String();
        String ss = new String();
        System.out.println(s == ss); // reference address are different even we are  assign value to objects
        // it gets false
        String obj1 = new String("pooja");
        String obj2 = new String("pooja");
        String obj3 = new String("Pooja");

        System.out.println(obj1 == obj2); //it gets false because compare address & it is diiferent address

        System.out.println(obj1.equals(obj2));  // it gets true because it checks values we are using equals method.
        System.out.println(obj1.equals(obj3));  // it gets false because it checks values but s3 values contains capital P.
    }
}
