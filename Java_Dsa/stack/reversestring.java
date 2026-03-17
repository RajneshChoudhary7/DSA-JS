package Java_Dsa.stack;
import java.util.Stack;
import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length();i++){
            st.push(s.charAt(i));
        }
        String s1="";
        while (!st.isEmpty()) {
            s1+=st.pop();
        }
        System.out.println(s1);
        

    }
}
