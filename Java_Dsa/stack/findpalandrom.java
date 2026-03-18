package Java_Dsa.stack;
import java.util.Stack;

public class findpalandrom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);

        temp.addAll(st);

        while (!st.isEmpty()) {
            st1.push(st.pop());
        }

        boolean check  = st1.equals(temp);
        if(check){
            System.out.println("stack is palandrom");
        }
        else{
            System.out.println("not palandrom");
        }
    }
}
