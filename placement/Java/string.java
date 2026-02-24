package placement.Java;

public class string {
    public static void main(String[] args) {
        String s1 = new String("Hello ") ;
        String s2 = new String("hi ");
        String s3  = new String(s1.concat(s2));
        System.out.println(s3);
        System.out.println(s1==s2);System.out.println(s1.equals(s2));


        int a = 50;
        int b= 50;
        System.out.println(a==b);
    }
}
