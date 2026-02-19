import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello world");

        // String  name  = "hello this is rajnesh";
        // String name2 = name.replace('e', 'b');
        // System.out.println(name2);
        // System.out.println(name.substring(0,4));

        Scanner sc = new Scanner(System.in);

        // int[] marks  = new int[4];
        // for (int i : marks) {
        //     sc.nextInt(i);
        // }
        // Arrays.sort(marks);

        System.out.println("Input your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println(name);

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        sc.close();
    }
}