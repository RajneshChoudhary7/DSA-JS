package Java_Dsa.stack;

import java.util.ArrayList;
import java.util.Stack;

public class stack2arraylist {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(2);
        st.push(1);

        ArrayList<Integer> list  = new ArrayList<>(st);

        boolean ispalandrom  = true;
        int i =0 , j=list.size()-1;
        while (i<j) {
        
        if(!list.get(i).equals(list.get(j))){
            ispalandrom = false;
            break;
        }
        i++;
        j--;
    }

    System.out.println(ispalandrom ? "palandrom" : "not palandrom");
    }
}
