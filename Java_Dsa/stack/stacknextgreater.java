package Java_Dsa.stack;
import java.util.*;
import java.util.Stack;
public class stacknextgreater {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 7, 9};
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}