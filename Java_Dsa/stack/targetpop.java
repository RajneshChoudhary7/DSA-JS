package Java_Dsa.stack;

import java.util.Stack;

public class targetpop {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int target = 11;
        st.push(13);
        st.push(1);
        st.push(12);
        st.push(10);
        st.push(90);
        st.push(3);

        while (!st.isEmpty()) {

            if (st.peek() <= target) {
                temp.push(st.pop());
            }
            st.pop();
        }


         while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println(st);
        
    }
}
