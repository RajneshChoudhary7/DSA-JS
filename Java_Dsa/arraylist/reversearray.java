package Java_Dsa.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class reversearray {
    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>(10);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);

        for(int i =0 , j=lst.size()-1;i<j;i++,j--){
            int temp = lst.get(i);
            lst.set(i, lst.get(j));
            lst.set(j, temp);

            
        }

        System.out.println(lst);

        Collections.reverse(lst);
        System.out.println(lst);
    }
}
