package Java_Dsa.stack;
import java.util.Stack;

public class sortstack {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        st.push(13);
        st.push(1);
        st.push(12);
        st.push(10);
        st.push(90);
        st.push(3);

        for(int x : st){
            System.out.print(x+"  ");
        }
        System.out.println();


        while (!st.isEmpty()) {

            int curr = st.pop();
            System.out.print(curr+" ");

            while (!temp.isEmpty() && temp.peek()<curr) {
                st.push(temp.pop());
            }

            temp.push(curr);
        }
        System.out.println();

        for(int x : temp){
            System.out.print(x+"  ");
        }
        System.out.println();

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
       for(int x : st){
            System.out.print(x+"  ");
        }
    }
}
 